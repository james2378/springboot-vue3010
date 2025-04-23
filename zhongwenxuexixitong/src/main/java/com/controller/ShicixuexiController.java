
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 诗词学习
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shicixuexi")
public class ShicixuexiController {
    private static final Logger logger = LoggerFactory.getLogger(ShicixuexiController.class);

    @Autowired
    private ShicixuexiService shicixuexiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("shicixuexiDeleteStart",1);params.put("shicixuexiDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shicixuexiService.queryPage(params);

        //字典表数据转换
        List<ShicixuexiView> list =(List<ShicixuexiView>)page.getList();
        for(ShicixuexiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShicixuexiEntity shicixuexi = shicixuexiService.selectById(id);
        if(shicixuexi !=null){
            //entity转view
            ShicixuexiView view = new ShicixuexiView();
            BeanUtils.copyProperties( shicixuexi , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShicixuexiEntity shicixuexi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shicixuexi:{}",this.getClass().getName(),shicixuexi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ShicixuexiEntity> queryWrapper = new EntityWrapper<ShicixuexiEntity>()
            .eq("shicixuexi_uuid_number", shicixuexi.getShicixuexiUuidNumber())
            .eq("shicixuexi_name", shicixuexi.getShicixuexiName())
            .eq("shicixuexi_video", shicixuexi.getShicixuexiVideo())
            .eq("shicixuexi_types", shicixuexi.getShicixuexiTypes())
            .eq("shicixuexi_clicknum", shicixuexi.getShicixuexiClicknum())
            .eq("shangxia_types", shicixuexi.getShangxiaTypes())
            .eq("shicixuexi_delete", shicixuexi.getShicixuexiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShicixuexiEntity shicixuexiEntity = shicixuexiService.selectOne(queryWrapper);
        if(shicixuexiEntity==null){
            shicixuexi.setShicixuexiClicknum(1);
            shicixuexi.setShangxiaTypes(1);
            shicixuexi.setShicixuexiDelete(1);
            shicixuexi.setCreateTime(new Date());
            shicixuexiService.insert(shicixuexi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShicixuexiEntity shicixuexi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shicixuexi:{}",this.getClass().getName(),shicixuexi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ShicixuexiEntity> queryWrapper = new EntityWrapper<ShicixuexiEntity>()
            .notIn("id",shicixuexi.getId())
            .andNew()
            .eq("shicixuexi_uuid_number", shicixuexi.getShicixuexiUuidNumber())
            .eq("shicixuexi_name", shicixuexi.getShicixuexiName())
            .eq("shicixuexi_video", shicixuexi.getShicixuexiVideo())
            .eq("shicixuexi_types", shicixuexi.getShicixuexiTypes())
            .eq("shicixuexi_clicknum", shicixuexi.getShicixuexiClicknum())
            .eq("shangxia_types", shicixuexi.getShangxiaTypes())
            .eq("shicixuexi_delete", shicixuexi.getShicixuexiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShicixuexiEntity shicixuexiEntity = shicixuexiService.selectOne(queryWrapper);
        if("".equals(shicixuexi.getShicixuexiPhoto()) || "null".equals(shicixuexi.getShicixuexiPhoto())){
                shicixuexi.setShicixuexiPhoto(null);
        }
        if("".equals(shicixuexi.getShicixuexiVideo()) || "null".equals(shicixuexi.getShicixuexiVideo())){
                shicixuexi.setShicixuexiVideo(null);
        }
        if("".equals(shicixuexi.getShicixuexiFile()) || "null".equals(shicixuexi.getShicixuexiFile())){
                shicixuexi.setShicixuexiFile(null);
        }
        if(shicixuexiEntity==null){
            shicixuexiService.updateById(shicixuexi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<ShicixuexiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ShicixuexiEntity shicixuexiEntity = new ShicixuexiEntity();
            shicixuexiEntity.setId(id);
            shicixuexiEntity.setShicixuexiDelete(2);
            list.add(shicixuexiEntity);
        }
        if(list != null && list.size() >0){
            shicixuexiService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ShicixuexiEntity> shicixuexiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShicixuexiEntity shicixuexiEntity = new ShicixuexiEntity();
//                            shicixuexiEntity.setShicixuexiUuidNumber(data.get(0));                    //诗词学习编号 要改的
//                            shicixuexiEntity.setShicixuexiName(data.get(0));                    //成语名称 要改的
//                            shicixuexiEntity.setShicixuexiPhoto("");//照片
//                            shicixuexiEntity.setShicixuexiVideo(data.get(0));                    //视频 要改的
//                            shicixuexiEntity.setShicixuexiFile(data.get(0));                    //相关文件 要改的
//                            shicixuexiEntity.setShicixuexiTypes(Integer.valueOf(data.get(0)));   //诗词学习类型 要改的
//                            shicixuexiEntity.setShicixuexiClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            shicixuexiEntity.setShicixuexiContent("");//照片
//                            shicixuexiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            shicixuexiEntity.setShicixuexiDelete(1);//逻辑删除字段
//                            shicixuexiEntity.setCreateTime(date);//时间
                            shicixuexiList.add(shicixuexiEntity);


                            //把要查询是否重复的字段放入map中
                                //诗词学习编号
                                if(seachFields.containsKey("shicixuexiUuidNumber")){
                                    List<String> shicixuexiUuidNumber = seachFields.get("shicixuexiUuidNumber");
                                    shicixuexiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shicixuexiUuidNumber = new ArrayList<>();
                                    shicixuexiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shicixuexiUuidNumber",shicixuexiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //诗词学习编号
                        List<ShicixuexiEntity> shicixuexiEntities_shicixuexiUuidNumber = shicixuexiService.selectList(new EntityWrapper<ShicixuexiEntity>().in("shicixuexi_uuid_number", seachFields.get("shicixuexiUuidNumber")).eq("shicixuexi_delete", 1));
                        if(shicixuexiEntities_shicixuexiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShicixuexiEntity s:shicixuexiEntities_shicixuexiUuidNumber){
                                repeatFields.add(s.getShicixuexiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [诗词学习编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shicixuexiService.insertBatch(shicixuexiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shicixuexiService.queryPage(params);

        //字典表数据转换
        List<ShicixuexiView> list =(List<ShicixuexiView>)page.getList();
        for(ShicixuexiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShicixuexiEntity shicixuexi = shicixuexiService.selectById(id);
            if(shicixuexi !=null){

                //点击数量加1
                shicixuexi.setShicixuexiClicknum(shicixuexi.getShicixuexiClicknum()+1);
                shicixuexiService.updateById(shicixuexi);

                //entity转view
                ShicixuexiView view = new ShicixuexiView();
                BeanUtils.copyProperties( shicixuexi , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShicixuexiEntity shicixuexi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shicixuexi:{}",this.getClass().getName(),shicixuexi.toString());
        Wrapper<ShicixuexiEntity> queryWrapper = new EntityWrapper<ShicixuexiEntity>()
            .eq("shicixuexi_uuid_number", shicixuexi.getShicixuexiUuidNumber())
            .eq("shicixuexi_name", shicixuexi.getShicixuexiName())
            .eq("shicixuexi_video", shicixuexi.getShicixuexiVideo())
            .eq("shicixuexi_types", shicixuexi.getShicixuexiTypes())
            .eq("shicixuexi_clicknum", shicixuexi.getShicixuexiClicknum())
            .eq("shangxia_types", shicixuexi.getShangxiaTypes())
            .eq("shicixuexi_delete", shicixuexi.getShicixuexiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShicixuexiEntity shicixuexiEntity = shicixuexiService.selectOne(queryWrapper);
        if(shicixuexiEntity==null){
            shicixuexi.setShicixuexiDelete(1);
            shicixuexi.setCreateTime(new Date());
        shicixuexiService.insert(shicixuexi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
