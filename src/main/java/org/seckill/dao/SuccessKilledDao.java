package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

	/**
	 * 插入购买明细，可过滤重复
	 * @param seckillId
	 * @param user_phone
	 * @return 插入的行数
	 */
	int insertSuccessed(@Param("seckillId") long seckillId, @Param("userPhone") long user_phone);
	
	/**
	 * 根据id查询SuccessKilled并携带秒杀产品对象
	 * @param seckilledId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(@Param("seckilledId") long seckilledId, @Param("userPhone") long userPhone);
	
}
