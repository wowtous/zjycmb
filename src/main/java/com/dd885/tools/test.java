package com.dd885.tools;


public class test {

	public static void main(String[] args) {
//		String keypath = System.getProperty("user.dir")+"/public.key";
//		Merchantable m = new MerchantOpt();
//		String s = m.genMerchantCode(keypath, "strDate", "strBranchID"
//				, "strCono", "strBillNo", "strAmount"
//				, "strMerchantPara", "strMerchantUrl"
//				, "strPayerID", "strPayeeID", "strClientIP"
//				, "strGoodsType", "strReserved"
//				);
////		System.out.println("192.168.1.1:8080/encrypt/"+s);
////		System.out.println(keypath);
//		s = "Succeed=Y&CoNo=000004&BillNo=8104700022&Amount=60&Date=20071213&MerchantPara=8120080420080414701013700022&Msg=00270000042007121307321387100000002470&Signature=177|48|67|121|22|40|125|29|39|162|103|204|103|156|74|196|63|148|45|142|206|139|243|120|224|193|84|46|216|23|42|29|25|64|232|213|114|3|22|51|131|76|169|143|183|229|87|164|138|77|185|198|116|254|224|68|26|169|194|160|94|35|111|150|";
//		
////		System.out.println(m.isVerifySign(s, keypath));
//		if(m.isVerifySign(s, keypath)){
//			System.out.println("1");
//		}else{
//			System.out.println("0");
//		}
		String keypath = test.class.getResource("/").getPath();
//		if(mc.isVerifySign(url, keypath)){
//			return "1";
//		}
//		return "0";
		System.out.println( keypath);
	}

}
