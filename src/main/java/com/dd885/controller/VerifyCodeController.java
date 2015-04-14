package com.dd885.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dd885.tools.MerchantOpt;
import com.dd885.tools.Merchantable;

@Controller
public class VerifyCodeController {
	Merchantable mc = new MerchantOpt();
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value = "/encrypt", method = RequestMethod.POST)
	@ResponseBody
	public String Encrypt(
			@RequestParam String key,
			@RequestParam String strDate,
			@RequestParam String strBranchID,
			@RequestParam String strCono,
			@RequestParam String strBillNo,
			@RequestParam String strAmount,
			@RequestParam String strMerchantPara,
			@RequestParam String strMerchantUrl,
			@RequestParam String strPayerID,
			@RequestParam String strPayeeID,
			@RequestParam String strClientIP,
			@RequestParam String strGoodsType,
			@RequestParam String strReserved) {
		return mc.genMerchantCode(key, strDate, strBranchID, strCono, strBillNo, strAmount, strMerchantPara, strMerchantUrl, strPayerID, strPayeeID, strClientIP, strGoodsType, strReserved);
	}
	
	@RequestMapping(value = "/decrypt", method = RequestMethod.POST)
	@ResponseBody
	public String Decrypt(@RequestParam String url) {
//		String keypath = System.getProperty("user.dir")+"/public.key";
		String keypath = VerifyCodeController.class.getResource("/").getPath()+"public.key";
		return mc.isVerifySign(url, keypath)+"";
	}
}
