package com.tenet.goods.service.goods;

import com.tenet.goods.api.entity.goods.GoSku;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * sku表 服务类
 * </p>
 *
 * @author Madison
 * @since 2021-02-20
 */
public interface IGoSkuService extends IService<GoSku> {

    List<GoSku> listByGoSpuIdList(List<Long> goSpuIdList);
}
