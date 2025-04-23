
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
 * 成语学习
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chengyuxuexi")
public class ChengyuxuexiController {
    private static final Logger logger = LoggerFactory.getLogger(ChengyuxuexiController.class);

    @Autowired
    private ChengyuxuexiService chengyuxuexiService;


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
        params.put("chengyuxuexiDeleteStart",1);params.put("chengyuxuexiDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = chengyuxuexiService.queryPage(params);

        //字典表数据转换
        List<ChengyuxuexiView> list =(List<ChengyuxuexiView>)page.getList();
        for(ChengyuxuexiView c:list){
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
        ChengyuxuexiEntity chengyuxuexi = chengyuxuexiService.selectById(id);
        if(chengyuxuexi !=null){
            //entity转view
            ChengyuxuexiView view = new ChengyuxuexiView();
            BeanUtils.copyProperties( chengyuxuexi , view );//把实体数据重构到view中

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
    public R save(@RequestBody ChengyuxuexiEntity chengyuxuexi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chengyuxuexi:{}",this.getClass().getName(),chengyuxuexi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ChengyuxuexiEntity> queryWrapper = new EntityWrapper<ChengyuxuexiEntity>()
            .eq("chengyuxuexi_uuid_number", chengyuxuexi.getChengyuxuexiUuidNumber())
            .eq("chengyuxuexi_name", chengyuxuexi.getChengyuxuexiName())
            .eq("chengyuxuexi_video", chengyuxuexi.getChengyuxuexiVideo())
            .eq("chengyuxuexi_types", chengyuxuexi.getChengyuxuexiTypes())
            .eq("chengyuxuexi_clicknum", chengyuxuexi.getChengyuxuexiClicknum())
            .eq("shangxia_types", chengyuxuexi.getShangxiaTypes())
            .eq("chengyuxuexi_delete", chengyuxuexi.getChengyuxuexiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChengyuxuexiEntity chengyuxuexiEntity = chengyuxuexiService.selectOne(queryWrapper);
        if(chengyuxuexiEntity==null){
            chengyuxuexi.setChengyuxuexiClicknum(1);
            chengyuxuexi.setShangxiaTypes(1);
            chengyuxuexi.setChengyuxuexiDelete(1);
            chengyuxuexi.setCreateTime(new Date());
            chengyuxuexiService.insert(chengyuxuexi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChengyuxuexiEntity chengyuxuexi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,chengyuxuexi:{}",this.getClass().getName(),chengyuxuexi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ChengyuxuexiEntity> queryWrapper = new EntityWrapper<ChengyuxuexiEntity>()
            .notIn("id",chengyuxuexi.getId())
            .andNew()
            .eq("chengyuxuexi_uuid_number", chengyuxuexi.getChengyuxuexiUuidNumber())
            .eq("chengyuxuexi_name", chengyuxuexi.getChengyuxuexiName())
            .eq("chengyuxuexi_video", chengyuxuexi.getChengyuxuexiVideo())
            .eq("chengyuxuexi_types", chengyuxuexi.getChengyuxuexiTypes())
            .eq("chengyuxuexi_clicknum", chengyuxuexi.getChengyuxuexiClicknum())
            .eq("shangxia_types", chengyuxuexi.getShangxiaTypes())
            .eq("chengyuxuexi_delete", chengyuxuexi.getChengyuxuexiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChengyuxuexiEntity chengyuxuexiEntity = chengyuxuexiService.selectOne(queryWrapper);
        if("".equals(chengyuxuexi.getChengyuxuexiPhoto()) || "null".equals(chengyuxuexi.getChengyuxuexiPhoto())){
                chengyuxuexi.setChengyuxuexiPhoto(null);
        }
        if("".equals(chengyuxuexi.getChengyuxuexiVideo()) || "null".equals(chengyuxuexi.getChengyuxuexiVideo())){
                chengyuxuexi.setChengyuxuexiVideo(null);
        }
        if("".equals(chengyuxuexi.getChengyuxuexiFile()) || "null".equals(chengyuxuexi.getChengyuxuexiFile())){
                chengyuxuexi.setChengyuxuexiFile(null);
        }
        if(chengyuxuexiEntity==null){
            chengyuxuexiService.updateById(chengyuxuexi);//根据id更新
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
        ArrayList<ChengyuxuexiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ChengyuxuexiEntity chengyuxuexiEntity = new ChengyuxuexiEntity();
            chengyuxuexiEntity.setId(id);
            chengyuxuexiEntity.setChengyuxuexiDelete(2);
            list.add(chengyuxuexiEntity);
        }
        if(list != null && list.size() >0){
            chengyuxuexiService.updateBatchById(list);
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
            List<ChengyuxuexiEntity> chengyuxuexiList = new ArrayList<>();//上传的东西
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
                            ChengyuxuexiEntity chengyuxuexiEntity = new ChengyuxuexiEntity();
//                            chengyuxuexiEntity.setChengyuxuexiUuidNumber(data.get(0));                    //成语学习编号 要改的
//                            chengyuxuexiEntity.setChengyuxuexiName(data.get(0));                    //成语名称 要改的
//                            chengyuxuexiEntity.setChengyuxuexiPhoto("");//照片
//                            chengyuxuexiEntity.setChengyuxuexiVideo(data.get(0));                    //视频 要改的
//                            chengyuxuexiEntity.setChengyuxuexiFile(data.get(0));                    //相关文件 要改的
//                            chengyuxuexiEntity.setChengyuxuexiTypes(Integer.valueOf(data.get(0)));   //成语学习类型 要改的
//                            chengyuxuexiEntity.setChengyuxuexiClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            chengyuxuexiEntity.setChengyuxuexiContent("");//照片
//                            chengyuxuexiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            chengyuxuexiEntity.setChengyuxuexiDelete(1);//逻辑删除字段
//                            chengyuxuexiEntity.setCreateTime(date);//时间
                            chengyuxuexiList.add(chengyuxuexiEntity);


                            //把要查询是否重复的字段放入map中
                                //成语学习编号
                                if(seachFields.containsKey("chengyuxuexiUuidNumber")){
                                    List<String> chengyuxuexiUuidNumber = seachFields.get("chengyuxuexiUuidNumber");
                                    chengyuxuexiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> chengyuxuexiUuidNumber = new ArrayList<>();
                                    chengyuxuexiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("chengyuxuexiUuidNumber",chengyuxuexiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //成语学习编号
                        List<ChengyuxuexiEntity> chengyuxuexiEntities_chengyuxuexiUuidNumber = chengyuxuexiService.selectList(new EntityWrapper<ChengyuxuexiEntity>().in("chengyuxuexi_uuid_number", seachFields.get("chengyuxuexiUuidNumber")).eq("chengyuxuexi_delete", 1));
                        if(chengyuxuexiEntities_chengyuxuexiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ChengyuxuexiEntity s:chengyuxuexiEntities_chengyuxuexiUuidNumber){
                                repeatFields.add(s.getChengyuxuexiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [成语学习编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        chengyuxuexiService.insertBatch(chengyuxuexiList);
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
        PageUtils page = chengyuxuexiService.queryPage(params);

        //字典表数据转换
        List<ChengyuxuexiView> list =(List<ChengyuxuexiView>)page.getList();
        for(ChengyuxuexiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChengyuxuexiEntity chengyuxuexi = chengyuxuexiService.selectById(id);
            if(chengyuxuexi !=null){

                //点击数量加1
                chengyuxuexi.setChengyuxuexiClicknum(chengyuxuexi.getChengyuxuexiClicknum()+1);
                chengyuxuexiService.updateById(chengyuxuexi);

                //entity转view
                ChengyuxuexiView view = new ChengyuxuexiView();
                BeanUtils.copyProperties( chengyuxuexi , view );//把实体数据重构到view中

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
    public R add(@RequestBody ChengyuxuexiEntity chengyuxuexi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,chengyuxuexi:{}",this.getClass().getName(),chengyuxuexi.toString());
        Wrapper<ChengyuxuexiEntity> queryWrapper = new EntityWrapper<ChengyuxuexiEntity>()
            .eq("chengyuxuexi_uuid_number", chengyuxuexi.getChengyuxuexiUuidNumber())
            .eq("chengyuxuexi_name", chengyuxuexi.getChengyuxuexiName())
            .eq("chengyuxuexi_video", chengyuxuexi.getChengyuxuexiVideo())
            .eq("chengyuxuexi_types", chengyuxuexi.getChengyuxuexiTypes())
            .eq("chengyuxuexi_clicknum", chengyuxuexi.getChengyuxuexiClicknum())
            .eq("shangxia_types", chengyuxuexi.getShangxiaTypes())
            .eq("chengyuxuexi_delete", chengyuxuexi.getChengyuxuexiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChengyuxuexiEntity chengyuxuexiEntity = chengyuxuexiService.selectOne(queryWrapper);
        if(chengyuxuexiEntity==null){
            chengyuxuexi.setChengyuxuexiDelete(1);
            chengyuxuexi.setCreateTime(new Date());
        chengyuxuexiService.insert(chengyuxuexi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
