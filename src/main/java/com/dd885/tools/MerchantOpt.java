package com.dd885.tools;

import cmb.MerchantCode;
import cmb.netpayment.Security;

public class MerchantOpt implements Merchantable{
	/**
	 * 根据传入的参数，生成校验码，如果一些参数为空，会导致生成校验码失败
	 */
	public String genMerchantCode(String key, String strDate,
			String strBranchID, String strCono, String strBillNo,
			String strAmount, String strMerchantPara, String strMerchantUrl,
			String strPayerID, String strPayeeID, String strClientIP,
			String strGoodsType, String strReserved) {
		String code = "";
		try {
			code = MerchantCode.genMerchantCode(key, strDate,strBranchID, strCono, strBillNo,strAmount, strMerchantPara, strMerchantUrl,strPayerID, strPayeeID, strClientIP,strGoodsType, strReserved);
		} catch (Exception e) {
//			System.err.println("传入的参数不正确，生成校验码失败,请核对参数值。  -->  "+ System.currentTimeMillis());
			e.printStackTrace();
		}
		return code;
	}

	/**
	 * 判断返回的URL是否是从银行返回
	 */
	public boolean isVerifySign(String url, String keypath) {
		boolean bRet =false;
		if (StringUtils.isNotNone(url)) {
			try {
				Security pay = new Security(keypath);

	            byte[] baSig = url.getBytes("GB2312");
				bRet = pay.checkInfoFromBank(baSig);
//				System.out.println("checkInfoFromBank: "+bRet);
			} catch(Exception e) {
				e.printStackTrace();
//				System.out.println("new netpayment object failed: "+e.getMessage());
			}
		}
		return bRet;
	}

}
