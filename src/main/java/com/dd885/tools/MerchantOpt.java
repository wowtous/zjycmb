package com.dd885.tools;

import cmb.MerchantCode;
import cmb.netpayment.Security;

public class MerchantOpt implements Merchantable{
	
	public String genMerchantCode(String key, String strDate,
			String strBranchID, String strCono, String strBillNo,
			String strAmount, String strMerchantPara, String strMerchantUrl,
			String strPayerID, String strPayeeID, String strClientIP,
			String strGoodsType, String strReserved) {
		return MerchantCode.genMerchantCode(key, strDate,strBranchID, strCono, strBillNo,strAmount, strMerchantPara, strMerchantUrl,strPayerID, strPayeeID, strClientIP,strGoodsType, strReserved);
	}

	public boolean isVerifySign(String url, String keypath) {
		boolean bRet =false;
		try {
			Security pay = new Security(keypath);

            byte[] baSig = url.getBytes("GB2312");
			bRet = pay.checkInfoFromBank(baSig);
			System.out.println("checkInfoFromBank: "+bRet);
		} catch(Exception e) {
			System.out.println("new netpayment object failed: "+e.getMessage());
		}
		return bRet;
	}

}
