package com.imooc.service;

import com.imooc.base.HouseSubscribeStatus;
import com.imooc.base.ServiceMultiResult;
import com.imooc.base.ServiceResult;
import com.imooc.dto.HouseDTO;
import com.imooc.dto.HouseSubscribeDTO;
import com.imooc.form.DatatableSearch;
import com.imooc.form.HouseForm;
import com.imooc.form.MapSearch;
import com.imooc.form.RentSearch;
import org.springframework.data.util.Pair;

import java.util.Date;

/**
 * 房屋管理服务接口
 * @author youyusong
 * @date 2018/9/6
 */
public interface IHouseService {

    /**
     * 新增房屋
     * @param houseForm
     * @return
     */
    ServiceResult<HouseDTO> save(HouseForm houseForm);

    /**
     * 管理员查询
     * @param searchBody
     * @return
     */
    ServiceMultiResult<HouseDTO> adminQuery(DatatableSearch searchBody);

    /**
     * 查询完整房源信息
     * @param id
     * @return
     */
    ServiceResult<HouseDTO> findCompleteOne(Long id);

    /**
     * 更新房源信息
     * @param houseForm
     * @return
     */
    ServiceResult update(HouseForm houseForm);

    /**
     * 移除图片
     * @param id
     * @return
     */
    ServiceResult removePhoto(Long id);

    /**
     * 更新封面
     * @param coverId
     * @param targetId
     * @return
     */
    ServiceResult updateCover(Long coverId, Long targetId);

    /**
     * 新增标签
     * @param houseId
     * @param tag
     * @return
     */
    ServiceResult addTag(Long houseId, String tag);

    /**
     * 移除标签
     * @param houseId
     * @param tag
     * @return
     */
    ServiceResult removeTag(Long houseId, String tag);

    /**
     * 更新房源状态
     * @param id
     * @param status
     * @return
     */
    ServiceResult updateStatus(Long id, int status);

    /**
     * 查询房源信息集
     * @param rentSearch
     * @return
     */
    ServiceMultiResult<HouseDTO> query(RentSearch rentSearch);

    /**
     * 全地图查询
     * @param mapSearch
     * @return
     */
    ServiceMultiResult<HouseDTO> wholeMapQuery(MapSearch mapSearch);

    /**
     * 精确范围数据查询
     * @param mapSearch
     * @return
     */
    ServiceMultiResult<HouseDTO> boundMapQuery(MapSearch mapSearch);

    /**
     * 加入预约清单
     * @param houseId
     * @return
     */
    ServiceResult addSubscribeOrder(Long houseId);

    /**
     * 获取对应状态的预约列表
     */
    ServiceMultiResult<Pair<HouseDTO, HouseSubscribeDTO>> querySubscribeList(HouseSubscribeStatus status, int start, int size);

    /**
     * * 预约看房时间
     * @param houseId
     * @param orderTime
     * @param telephone
     * @param desc
     * @return
             */
    ServiceResult subscribe(Long houseId, Date orderTime, String telephone, String desc);

    /**
     * 取消预约
     * @param houseId
     * @return
     */
    ServiceResult cancelSubscribe(Long houseId);

    /**
     * 管理员查询预约信息接口
     * @param start
     * @param size
     */
    ServiceMultiResult<Pair<HouseDTO, HouseSubscribeDTO>> findSubscribeList(int start, int size);

    /**
     * 完成预约
     */
    ServiceResult finishSubscribe(Long houseId);

}
