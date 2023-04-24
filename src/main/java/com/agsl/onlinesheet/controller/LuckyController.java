package com.agsl.onlinesheet.controller;

import com.agsl.onlinesheet.mapper.LuckyDto;
import com.agsl.onlinesheet.model.TbLuckyData;
import com.agsl.onlinesheet.model.TbLuckyFile;
import com.agsl.onlinesheet.model.TbLuckySheet;
import com.agsl.onlinesheet.service.LuckyCellService;
import com.agsl.onlinesheet.service.LuckyFileService;
import com.agsl.onlinesheet.service.LuckySheetService;
import com.agsl.onlinesheet.utils.JsonResult;
import com.agsl.onlinesheet.utils.ResultUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 在线表格接口
 * TODO 现有业务仅仅满足表头和首列固定的模式，建议分为修改模式和追加模式；
 * TODO 修改模式：适用于表头和首列都有的模板。用户编辑的行号是固定的，后端不会改行号；
 * TODO 追加模式：适用于表头的模板。每个用户都编辑第一行，后端根据修改时间，偏移行号；
 *
 * @author liuyong
 * @date 2023年 03月22日 16:32:05
 */
@RestController
@RequestMapping("/api/onlineExcel")
public class LuckyController {
    @Autowired
    private LuckyFileService fileService;
//    AddressingDispositionException

    @Autowired
    private LuckySheetService sheetService;

    @Autowired
    private LuckyCellService cellService;


    /**
     * @description
     * @author ly
     * @date 2023/3/22 17:43
     */
    @RequestMapping(value = "/file/get", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getFile(@RequestBody LuckyDto luckyDto) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("grid_key", luckyDto.getGridKey());
        TbLuckyFile one = fileService.getOne(queryWrapper);
        return ResultUtil.success(one);
    }

    /**
     * @description
     * @author ly
     * @date 2023/3/22 17:43
     */
    @RequestMapping(value = "file/set", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult setFile(@RequestBody TbLuckyFile luckyFile) {
        boolean b = fileService.saveOrUpdate(luckyFile);
        return ResultUtil.success(b);
    }

    /**
     * @description
     * @author ly
     * @date 2023/3/22 17:43
     */
    @RequestMapping(value = "sheet/get", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getSheet(@RequestBody LuckyDto luckyDto) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("grid_key", luckyDto.getGridKey());
        List list = sheetService.list(queryWrapper);
        return ResultUtil.success(list);
    }

    /**
     * @description
     * @author ly
     * @date 2023/3/22 17:43
     */
    @RequestMapping(value = "sheet/set", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult setSheet(@RequestBody TbLuckySheet luckySheet) {
        boolean b = sheetService.saveOrUpdate(luckySheet);
        return ResultUtil.success(b);
    }

    /**
     * @description
     * @author ly
     * @date 2023/3/22 17:43
     */
    @RequestMapping(value = "cell/get", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getCell(@RequestBody LuckyDto luckyDto) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("index", luckyDto.getIndex());
        //queryWrapper.eq("user_info", luckyDto.getUserInfo());
        queryWrapper.likeRight("user_info", luckyDto.getUserInfo());
        List list = cellService.list(queryWrapper);
        return ResultUtil.success(list);
    }

    /**
     * @description
     * @author ly
     * @date 2023/3/22 17:43
     */
    @RequestMapping(value = "cell/set", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult setcell(@RequestBody TbLuckyData luckyCell) {
        boolean b = cellService.saveOrUpdate(luckyCell);
        return ResultUtil.success(b);
    }
}
