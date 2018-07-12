package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillClosedException;
import org.seckill.exception.SeckillException;

/**
 * ҵ��ӿڣ�վ��"ʹ����"�Ƕ���ƽӿ�
 * �����������ȣ���������������
 * @author Administrator
 *
 */
public interface SeckillService {
	
	/**
	 * ��ѯ������ɱ��¼
	 * @return
	 */
	List<Seckill> getSeckillList();
	
	/**
	 * ��ѯ������ɱ��¼
	 * @param seckillId
	 * @return
	 */
	Seckill getById(long seckillId);
	
	/**
	 * ��ɱ��ʼʱ�����ɱ�ӿڵĵ�ַ��
	 * �������ϵͳʱ�����ɱʱ��
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/**
	 * ִ����ɱ����
	 */
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
		throws SeckillException,RepeatKillException,SeckillClosedException;
}
