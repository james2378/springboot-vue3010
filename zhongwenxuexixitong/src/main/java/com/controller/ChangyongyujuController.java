
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
 * 常用语句
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/changyongyuju")
public class ChangyongyujuController {
    private static final Logger logger = LoggerFactory.getLogger(ChangyongyujuController.class);

    @Autowired
    private ChangyongyujuService changyongyujuService;


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
        params.put("changyongyujuDeleteStart",1);params.put("changyongyujuDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = changyongyujuService.queryPage(params);

        //字典表数据转换
        List<ChangyongyujuView> list =(List<ChangyongyujuView>)page.getList();
        for(ChangyongyujuView c:list){
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
        ChangyongyujuEntity changyongyuju = changyongyujuService.selectById(id);
        if(changyongyuju !=null){
            //entity转view
            ChangyongyujuView view = new ChangyongyujuView();
            BeanUtils.copyProperties( changyongyuju , view );//把实体数据重构到view中

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
    public R save(@RequestBody ChangyongyujuEntity changyongyuju, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,changyongyuju:{}",this.getClass().getName(),changyongyuju.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ChangyongyujuEntity> queryWrapper = new EntityWrapper<ChangyongyujuEntity>()
            .eq("changyongyuju_uuid_number", changyongyuju.getChangyongyujuUuidNumber())
            .eq("changyongyuju_name", changyongyuju.getChangyongyujuName())
            .eq("changyongyuju_video", changyongyuju.getChangyongyujuVideo())
            .eq("changyongyuju_music", changyongyuju.getChangyongyujuMusic())
            .eq("changyongyuju_types", changyongyuju.getChangyongyujuTypes())
            .eq("changyongyuju_clicknum", changyongyuju.getChangyongyujuClicknum())
            .eq("shangxia_types", changyongyuju.getShangxiaTypes())
            .eq("changyongyuju_delete", changyongyuju.getChangyongyujuDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChangyongyujuEntity changyongyujuEntity = changyongyujuService.selectOne(queryWrapper);
        if(changyongyujuEntity==null){
            changyongyuju.setChangyongyujuClicknum(1);
            changyongyuju.setShangxiaTypes(1);
            changyongyuju.setChangyongyujuDelete(1);
            changyongyuju.setCreateTime(new Date());
            changyongyujuService.insert(changyongyuju);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChangyongyujuEntity changyongyuju, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,changyongyuju:{}",this.getClass().getName(),changyongyuju.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ChangyongyujuEntity> queryWrapper = new EntityWrapper<ChangyongyujuEntity>()
            .notIn("id",changyongyuju.getId())
            .andNew()
            .eq("changyongyuju_uuid_number", changyongyuju.getChangyongyujuUuidNumber())
            .eq("changyongyuju_name", changyongyuju.getChangyongyujuName())
            .eq("changyongyuju_video", changyongyuju.getChangyongyujuVideo())
            .eq("changyongyuju_music", changyongyuju.getChangyongyujuMusic())
            .eq("changyongyuju_types", changyongyuju.getChangyongyujuTypes())
            .eq("changyongyuju_clicknum", changyongyuju.getChangyongyujuClicknum())
            .eq("shangxia_types", changyongyuju.getShangxiaTypes())
            .eq("changyongyuju_delete", changyongyuju.getChangyongyujuDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChangyongyujuEntity changyongyujuEntity = changyongyujuService.selectOne(queryWrapper);
        if("".equals(changyongyuju.getChangyongyujuPhoto()) || "null".equals(changyongyuju.getChangyongyujuPhoto())){
                changyongyuju.setChangyongyujuPhoto(null);
        }
        if("".equals(changyongyuju.getChangyongyujuVideo()) || "null".equals(changyongyuju.getChangyongyujuVideo())){
                changyongyuju.setChangyongyujuVideo(null);
        }
        if("".equals(changyongyuju.getChangyongyujuFile()) || "null".equals(changyongyuju.getChangyongyujuFile())){
                changyongyuju.setChangyongyujuFile(null);
        }
        if(changyongyujuEntity==null){
            changyongyujuService.updateById(changyongyuju);//根据id更新
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
        ArrayList<ChangyongyujuEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ChangyongyujuEntity changyongyujuEntity = new ChangyongyujuEntity();
            changyongyujuEntity.setId(id);
            changyongyujuEntity.setChangyongyujuDelete(2);
            list.add(changyongyujuEntity);
        }
        if(list != null && list.size() >0){
            changyongyujuService.updateBatchById(list);
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
            List<ChangyongyujuEntity> changyongyujuList = new ArrayList<>();//上传的东西
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
                            ChangyongyujuEntity changyongyujuEntity = new ChangyongyujuEntity();
//                            changyongyujuEntity.setChangyongyujuUuidNumber(data.get(0));                    //常用语句编号 要改的
//                            changyongyujuEntity.setChangyongyujuName(data.get(0));                    //常用语句名称 要改的
//                            changyongyujuEntity.setChangyongyujuPhoto("");//照片
//                            changyongyujuEntity.setChangyongyujuVideo(data.get(0));                    //视频 要改的
//                            changyongyujuEntity.setChangyongyujuMusic(data.get(0));                    //发音 要改的
//                            changyongyujuEntity.setChangyongyujuFile(data.get(0));                    //相关文件 要改的
//                            changyongyujuEntity.setChangyongyujuTypes(Integer.valueOf(data.get(0)));   //常用语句类型 要改的
//                            changyongyujuEntity.setChangyongyujuClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            changyongyujuEntity.setChangyongyujuContent("");//照片
//                            changyongyujuEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            changyongyujuEntity.setChangyongyujuDelete(1);//逻辑删除字段
//                            changyongyujuEntity.setCreateTime(date);//时间
                            changyongyujuList.add(changyongyujuEntity);


                            //把要查询是否重复的字段放入map中
                                //常用语句编号
                                if(seachFields.containsKey("changyongyujuUuidNumber")){
                                    List<String> changyongyujuUuidNumber = seachFields.get("changyongyujuUuidNumber");
                                    changyongyujuUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> changyongyujuUuidNumber = new ArrayList<>();
                                    changyongyujuUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("changyongyujuUuidNumber",changyongyujuUuidNumber);
                                }
                        }

                        //查询是否重复
                         //常用语句编号
                        List<ChangyongyujuEntity> changyongyujuEntities_changyongyujuUuidNumber = changyongyujuService.selectList(new EntityWrapper<ChangyongyujuEntity>().in("changyongyuju_uuid_number", seachFields.get("changyongyujuUuidNumber")).eq("changyongyuju_delete", 1));
                        if(changyongyujuEntities_changyongyujuUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ChangyongyujuEntity s:changyongyujuEntities_changyongyujuUuidNumber){
                                repeatFields.add(s.getChangyongyujuUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [常用语句编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        changyongyujuService.insertBatch(changyongyujuList);
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
        PageUtils page = changyongyujuService.queryPage(params);

        //字典表数据转换
        List<ChangyongyujuView> list =(List<ChangyongyujuView>)page.getList();
        for(ChangyongyujuView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChangyongyujuEntity changyongyuju = changyongyujuService.selectById(id);
            if(changyongyuju !=null){

                //点击数量加1
                changyongyuju.setChangyongyujuClicknum(changyongyuju.getChangyongyujuClicknum()+1);
                changyongyujuService.updateById(changyongyuju);

                //entity转view
                ChangyongyujuView view = new ChangyongyujuView();
                BeanUtils.copyProperties( changyongyuju , view );//把实体数据重构到view中

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
    public R add(@RequestBody ChangyongyujuEntity changyongyuju, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,changyongyuju:{}",this.getClass().getName(),changyongyuju.toString());
        Wrapper<ChangyongyujuEntity> queryWrapper = new EntityWrapper<ChangyongyujuEntity>()
            .eq("changyongyuju_uuid_number", changyongyuju.getChangyongyujuUuidNumber())
            .eq("changyongyuju_name", changyongyuju.getChangyongyujuName())
            .eq("changyongyuju_video", changyongyuju.getChangyongyujuVideo())
            .eq("changyongyuju_music", changyongyuju.getChangyongyujuMusic())
            .eq("changyongyuju_types", changyongyuju.getChangyongyujuTypes())
            .eq("changyongyuju_clicknum", changyongyuju.getChangyongyujuClicknum())
            .eq("shangxia_types", changyongyuju.getShangxiaTypes())
            .eq("changyongyuju_delete", changyongyuju.getChangyongyujuDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChangyongyujuEntity changyongyujuEntity = changyongyujuService.selectOne(queryWrapper);
        if(changyongyujuEntity==null){
            changyongyuju.setChangyongyujuDelete(1);
            changyongyuju.setCreateTime(new Date());
        changyongyujuService.insert(changyongyuju);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
