package org.egov.migrationkit.constants;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WSConstants {
	
	public static final String URL_PARAMS_SEPARATER = "?";

	public static final String TENANT_ID_FIELD_FOR_SEARCH_URL = "tenantId=";

	public static final String SEPARATER = "&";

	public static final String SERVICE_FIELD_FOR_SEARCH_URL = "service=";

	public static final String CONSUMER_CODE_SEARCH_FIELD_NAME = "consumerCode=";
	
	public static final String BUSINESSSERVICE_FIELD_FOR_SEARCH_URL = "businessService=";
	
	public static final String WATER_TAX_SERVICE_CODE = "WS";
	
    public static final String WATER_BUSINESS_SERVICE="WS";
    
    public static final String SEWERAGE_BUSINESS_SERVICE="SW";
    
    public static final List<String> ONE_TIME_TAX_HEAD_MASTERS = Collections.unmodifiableList(
    		Arrays.asList("WS_OTHER_FEE", "WS_ROAD_CUTTING_CHARGE", "WS_FORM_FEE", "WS_SECURITY_DEPOSIT"));
    
    public static final String ONE_TIME_FEE_CONST = ".ONE_TIME_FEE";
	
	public static final HashMap<String, String> DIGIT_ROAD_CATEGORIES = new HashMap<>();
	public static final HashMap<String, Long> TIME_PERIOD_MAP = new HashMap<>();
	public static final HashMap<String, String> TAX_HEAD_MAP = new HashMap<>();
	
	public static final HashMap<String, String> DOCTYPEMAP = new HashMap<>();

    public static final String PERIOD_FROM="periodFrom";

    public static final String PERIOD_TO="periodFrom";

	
    static {
    	
        DIGIT_ROAD_CATEGORIES.put("Premix Carpet", "PREMIXCARPET");
        DIGIT_ROAD_CATEGORIES.put("BM and Premix Road", "BMPREMIXROAD");
        DIGIT_ROAD_CATEGORIES.put("Berm Cutting (Katcha)", "BERMCUTTINGKATCHA");
        DIGIT_ROAD_CATEGORIES.put("Brick Paving", "BRICKPAVING");
        DIGIT_ROAD_CATEGORIES.put("CC Road", "CCROAD");
        DIGIT_ROAD_CATEGORIES.put("Interlocking Paver Block", "INTERLOCKINGPAVERBLOCK");
        DIGIT_ROAD_CATEGORIES.put("Under Scheme", "UNDERSCHEME");
        DIGIT_ROAD_CATEGORIES.put("Open Pipe", "OPENPIPE");
        
        TAX_HEAD_MAP.put("METERCHARGES", "WS_METER_TESTING_FEE");
        TAX_HEAD_MAP.put("PENALTY", "WS_TIME_PENALTY");
        TAX_HEAD_MAP.put("BREAKDOWN_PENALTY", "WS_TIME_PENALTY");
        TAX_HEAD_MAP.put("INTEREST", "WS_TIME_INTEREST");
        TAX_HEAD_MAP.put("WTAXCHARGES", "WS_CHARGE");
        TAX_HEAD_MAP.put("METERRENT", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("WTADJUSTMENT", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("DOORTODOORCOLLECTIONCHARGES", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("TITLETRANSFERFEE", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("ADDITIONALFEEFORTITLETRANSFER", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("WTAXSUPERVISION", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("WTADVANCE", "WS_ADVANCE_CARRYFORWARD");
        TAX_HEAD_MAP.put("WTAXSECURITY", "WS_SECURITY_DEPOSIT");
        TAX_HEAD_MAP.put("WTAXOTHERS", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("WTAXROADCUTTING", "WS_ROAD_CUTTING_CHARGE");
        TAX_HEAD_MAP.put("WTAXAPPLICATION", "WS_FORM_FEE");
        TAX_HEAD_MAP.put("CONNECTIONTYPECONVERSIONFEE", "WS_OTHER_FEE");
        
        TAX_HEAD_MAP.put("SEWERAGEADVANCE","SW_ADVANCE_CARRYFORWARD");
        TAX_HEAD_MAP.put("STAXSECURITY","SW_SECURITY_DEPOSIT");
        TAX_HEAD_MAP.put("STAXOTHERS","SW_OTHER_FEE");
        TAX_HEAD_MAP.put("STAXROADCUTTING","SW_ROAD_CUTTING_CHARGE");
        TAX_HEAD_MAP.put("STAXAPPLICATION","SW_OTHER_FEE");
        TAX_HEAD_MAP.put("STAXSUPERVISION","SW_OTHER_FEE");
        TAX_HEAD_MAP.put("SEWERAGETAX","SW_CHARGE");
        TAX_HEAD_MAP.put("SWTAXADJUSTMENT","SW_OTHER_FEE");

        
        //2022-23 
//        TIME_PERIOD_MAP.put("2022-03-31", 1648771199000l);     
//        TIME_PERIOD_MAP.put("2022-04-01", 1648771200000l);
//        TIME_PERIOD_MAP.put("2022-06-30", 1656633599000l);
//        TIME_PERIOD_MAP.put("2022-07-01", 1656633600000l);
//        TIME_PERIOD_MAP.put("2022-09-30", 1664582399000l);
//        TIME_PERIOD_MAP.put("2022-10-01", 1664582400000l);
//        TIME_PERIOD_MAP.put("2022-12-31",1672531199000l);
//        TIME_PERIOD_MAP.put("2022-01-01", 1640995200000l);
//        
//        TIME_PERIOD_MAP.put("2023-01-01",1672531200000l);
//        TIME_PERIOD_MAP.put("2023-03-31",1680307199000l);
//       
        
        //2021
        TIME_PERIOD_MAP.put("2021-03-31", 1617235199000l);            
        TIME_PERIOD_MAP.put("2021-04-01", 1617235200000l);
        TIME_PERIOD_MAP.put("2021-06-30", 1625097599000l);
        TIME_PERIOD_MAP.put("2021-07-01", 1625097600000l);
        TIME_PERIOD_MAP.put("2021-09-30", 1633046399000l);
        TIME_PERIOD_MAP.put("2021-10-01", 1633046400000l);
        TIME_PERIOD_MAP.put("2021-12-31", 1640995199000l);
        TIME_PERIOD_MAP.put("2021-01-01", 1609459200000l);
        
      

        //2020
        TIME_PERIOD_MAP.put("2020-03-31", 1585699199000l);    
        TIME_PERIOD_MAP.put("2020-04-01", 1585699200000l);
        TIME_PERIOD_MAP.put("2020-06-30", 1593561599000l);
        TIME_PERIOD_MAP.put("2020-07-01", 1593561600000l);
        TIME_PERIOD_MAP.put("2020-09-30", 1601510399000l);
        TIME_PERIOD_MAP.put("2020-10-01", 1601510400000l);
        TIME_PERIOD_MAP.put("2020-12-31", 1609459199000l);
        TIME_PERIOD_MAP.put("2020-01-01", 1577836800000l);
        
       
        
        //2019
        TIME_PERIOD_MAP.put("2019-03-31", 1554076799000l);
        TIME_PERIOD_MAP.put("2019-04-01", 1554076800000l);
        TIME_PERIOD_MAP.put("2019-06-30", 1561939199000l);
        TIME_PERIOD_MAP.put("2019-07-01", 1561939200000l);
        TIME_PERIOD_MAP.put("2019-09-30", 1569887999000l);
        TIME_PERIOD_MAP.put("2019-10-01", 1569888000000l);
        TIME_PERIOD_MAP.put("2019-12-31", 1577836799000l);
        TIME_PERIOD_MAP.put("2019-01-01", 1546300800000l);
        
        
      
        //2018
        TIME_PERIOD_MAP.put("2018-03-31",1522540799000l);
        TIME_PERIOD_MAP.put("2018-04-01", 1522540800000l);
        TIME_PERIOD_MAP.put("2018-06-30", 1530403199000l);
        TIME_PERIOD_MAP.put("2018-07-01", 1530403200000l);
        TIME_PERIOD_MAP.put("2018-09-30", 1538351999000l);
        TIME_PERIOD_MAP.put("2018-10-01", 1538352000000l);
        TIME_PERIOD_MAP.put("2018-12-31", 1546300799000l);
        TIME_PERIOD_MAP.put("2018-01-01",1514764800000l);
        
        
        
       
        
        //2017
        TIME_PERIOD_MAP.put("2017-03-31",1491004799000l);
        TIME_PERIOD_MAP.put("2017-04-01",1491004800000l);
        TIME_PERIOD_MAP.put("2017-06-30",1498867199000l);
        TIME_PERIOD_MAP.put("2017-07-01",1498867200000l);
        TIME_PERIOD_MAP.put("2017-09-30",1506815999000l);
        TIME_PERIOD_MAP.put("2017-10-01",1506816000000l);
        TIME_PERIOD_MAP.put("2017-12-31",1514764799000l);
        TIME_PERIOD_MAP.put("2017-01-01",1483228800000l);
        //2016
        TIME_PERIOD_MAP.put("2016-03-31",1459468799000l);
        TIME_PERIOD_MAP.put("2016-04-01",1459468800000l);
        TIME_PERIOD_MAP.put("2016-06-30",1467331199000l);
        TIME_PERIOD_MAP.put("2016-07-01",1467331200000l);
        TIME_PERIOD_MAP.put("2016-09-30",1475279999000l);
        TIME_PERIOD_MAP.put("2016-10-01",1475280000000l);
        TIME_PERIOD_MAP.put("2016-12-31",1483228799000l);
        TIME_PERIOD_MAP.put("2016-01-01",1451606400000l);
        //2015
        TIME_PERIOD_MAP.put("2015-03-31",1427846399000l);
        TIME_PERIOD_MAP.put("2015-04-01",1427846400000l);
        TIME_PERIOD_MAP.put("2015-06-30",1435708799000l);
        TIME_PERIOD_MAP.put("2015-07-01",1435708800000l);
        TIME_PERIOD_MAP.put("2015-09-30",1443657599000l);
        TIME_PERIOD_MAP.put("2015-10-01",1443657600000l);
        TIME_PERIOD_MAP.put("2015-12-31",1451606399000l);
        TIME_PERIOD_MAP.put("2015-01-01",1420070400000l);
        //2014
        TIME_PERIOD_MAP.put("2014-03-31",1396310399000l);
        TIME_PERIOD_MAP.put("2014-04-01",1396310400000l);
        TIME_PERIOD_MAP.put("2014-06-30",1404172799000l);
        TIME_PERIOD_MAP.put("2014-07-01",1404172800000l);
        TIME_PERIOD_MAP.put("2014-09-30",1412121599000l);
        TIME_PERIOD_MAP.put("2014-10-01",1412121600000l);
        TIME_PERIOD_MAP.put("2014-12-31",1420070399000l);
        TIME_PERIOD_MAP.put("2014-01-01",1388534400000l);
        //2013
        TIME_PERIOD_MAP.put("2013-03-31",1364774399000l);
        TIME_PERIOD_MAP.put("2013-04-01",1364774400000l);
        TIME_PERIOD_MAP.put("2013-06-30",1372636799000l);
        TIME_PERIOD_MAP.put("2013-07-01",1372636800000l);
        TIME_PERIOD_MAP.put("2013-09-30",1380585599000l);
        TIME_PERIOD_MAP.put("2013-10-01",1380585600000l);
        TIME_PERIOD_MAP.put("2013-12-31",1388534399000l);
        TIME_PERIOD_MAP.put("2013-01-01",1356998400000l);
        
         
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.AADHAAR", "OWNER.IDENTITYPROOF.AADHAAR");
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.VOTERID", "OWNER.IDENTITYPROOF.VOTERID");
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.DRIVING", "OWNER.IDENTITYPROOF.DRIVING");
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.PAN", "OWNER.IDENTITYPROOF.PAN");
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.PASSPORT", "OWNER.IDENTITYPROOF.PASSPORT");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.ELECTRICITYBILL", "OWNER.ADDRESSPROOF.ELECTRICITYBILL");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.DL", "OWNER.ADDRESSPROOF.DL");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.VOTERID", "OWNER.ADDRESSPROOF.VOTERID");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.AADHAAR", "OWNER.ADDRESSPROOF.AADHAAR");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.PAN", "OWNER.ADDRESSPROOF.PAN");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.PASSPORT", "OWNER.ADDRESSPROOF.PASSPORT");
        DOCTYPEMAP.put("PLUMBER_REPORT_DRAWING", "PLUMBER_REPORT_DRAWING");
        DOCTYPEMAP.put("BUILDING_PLAN_OR_COMPLETION_CERTIFICATE", "BUILDING_PLAN_OR_COMPLETION_CERTIFICATE");
        DOCTYPEMAP.put("PROPERTY_TAX_RECIEPT", "PROPERTY_TAX_RECIEPT");
       
        
        
        
        
    }
    
    
}
