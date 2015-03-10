package com.dd885.tools;

public interface Merchantable {
	/**
	 * @param key					//商户密钥
	 * @param strDate				//订单日期
	 * @param strBranchID			//开户分行号
	 * @param strCono				//商户号
	 * @param strBillNo				//订单号
	 * @param strAmount				//订单金额
	 * @param strMerchantPara		//商户自定义参数
	 * @param strMerchantUrl		//商户接受通知的URL
	 * @param strPayerID			//付款方用户标识。用来唯一标识商户的一个用户。长度限制为40字节以内。
	 * @param strPayeeID			//收款方的用户标识。生成规则同上。
	 * @param strClientIP			//商户取得的客户端IP，如果有多个IP用逗号”,”分隔。长度限制为64字节。
	 * @param strGoodsType			//商品类型，长度限制为8字节。
	 * @param strReserved			//保留，长度限制为1024字节。
	 * @return
	 */
	String genMerchantCode(
			String key,				//商户密钥
			String strDate,			//订单日期
			String strBranchID, 	//开户分行号
			String strCono, 		//商户号
			String strBillNo,		//订单号
			String strAmount,		//订单金额
			String strMerchantPara, //商户自定义参数
			String strMerchantUrl,	//商户接受通知的URL
			String strPayerID,		//付款方用户标识。用来唯一标识商户的一个用户。长度限制为40字节以内。
			String strPayeeID,		//收款方的用户标识。生成规则同上。
			String strClientIP,		//商户取得的客户端IP，如果有多个IP用逗号”,”分隔。长度限制为64字节。
			String strGoodsType,	//商品类型，长度限制为8字节。
			String strReserved		//保留，长度限制为1024字节。
	);
	
	boolean isVerifySign(String url,String keypath);
}
