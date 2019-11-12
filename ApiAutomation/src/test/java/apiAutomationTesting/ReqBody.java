package apiAutomationTesting;

public class ReqBody {
	
	static String getIncomeLimitsReqBody = "{\r\n" + 
			"  \"houseHoldSize\": 11,\r\n" + 
			"  \"programName\": \"CoCAll\"\r\n" + 
			"}\r\n" + 
			"";
	
	
	static String ValidateUserreqBody = "{" + 
			"  \"user\": {" + 
			"    \"pinNumber\": \"1091987696\"," + 
			"    \"ssn\": \"string\",\r\n" + 
			"    \"userBthDt\": \"1989-10-21\"," + 
			"    \"uuid\": \"103f19ed-fd71-4fba-972f-fd4b3b65c999\"" + 
			"  }" + 
			"}";
	
	
	static String benFinReqBody = "\r\n" + 
				"{\r\n" + 
				"  \"core\": [\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 1,\r\n" + 
				"      \"quesText\": \"Please select the programs for which you would like to screen:\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"core\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"\",\r\n" + 
				"      \"quesFormElementType\": \"checkbox\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Select All\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Screen\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Health Care\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Healthcare\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Child Care\",\r\n" + 
				"          \"booleanValue\": true,\r\n" + 
				"          \"textValue\": \"Childcare\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Family Assistance\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"WVWorks\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Home Energy Services\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"LIEAP\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Food & Nutrition\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"SNAP\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Long Term Care (Nursing or In-Home Care)\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Nursing\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Medicare Premium Assistance\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Medicare\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"School Clothing Allowance\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"SCA\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Child Support Services\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"CSP\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"general\": [\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 2,\r\n" + 
				"      \"quesText\": \"Does your household reside in West Virginia?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"general\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"Y\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 3,\r\n" + 
				"      \"quesText\": \"What county do you live in?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"general\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"Brooke\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Anoka\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"ano\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Dakota\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"dak\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Hennepin\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"hen\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Olmsted\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"olm\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Ramsey\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"ram\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"St Louis\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"stl\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Scott\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"sco\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Stearns\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"ste\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Wright\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"wri\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Washington\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"was\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Barbour\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Barbour\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Berkeley\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Berkeley\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Boone\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Boone\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Braxton\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Braxton\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Brooke\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Brooke\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Cabell\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Cabell\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Calhoun\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Calhoun\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Clay\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Clay\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Doddridge\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Doddridge\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Fayette\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Fayette\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Gilmer\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Gilmer\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Grant\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Grant\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Greenbrier\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Greenbrier\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Hampshire\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Hampshire\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Hancock\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Hancock\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Hardy\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Hardy\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Harrison\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Harrison\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Jackson\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Jackson\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Jefferson\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Jefferson\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Kanawha\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Kanawha\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Lewis\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Lewis\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Lincoln\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Lincoln\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Logan\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Logan\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Marion\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Marion\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Marshall\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Marshall\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Mason\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Mason\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"McDowell\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"McDowell\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Mercer\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Mercer\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Mineral\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Mineral\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Mingo\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Mingo\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Monongalia\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Monongalia\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Monroe\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Monroe\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Morgan\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Morgan\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Nicholas\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Nicholas\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Ohio\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Ohio\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Pendleton\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Pendleton\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Pleasants\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Pleasants\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Pocahontas\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Pocahontas\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Preston\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Preston\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Putnam\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Putnam\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Raleigh\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Raleigh\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Randolph\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Randolph\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Ritchie\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Ritchie\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Roane\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Roane\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Summers\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Summers\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Taylor\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Taylor\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Tucker\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Tucker\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Tyler\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Tyler\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Upshur\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Upshur\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Wayne\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Wayne\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Webster\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Webster\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Wetzel\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Wetzel\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Wirt\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Wirt\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Wood\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Wood\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Wyoming\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Wyoming\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 4,\r\n" + 
				"      \"quesText\": \"How many people are in the household?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"general\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"1\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"1\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"1\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"2\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"2\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"3\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"3\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"4\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"4\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"5\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"5\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"6\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"6\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"7\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"7\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"8\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"8\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"9\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"9\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"10\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"10\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"11\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"11\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"12\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"12\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"13\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"13\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"14\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"14\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"15\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"15\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"16\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"16\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"17\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"17\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"18\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"18\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"19\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"19\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"20\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"20\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"21\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"21\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 5,\r\n" + 
				"      \"quesText\": \"How old are the people in the household (check all that apply)?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"general\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"\",\r\n" + 
				"      \"quesFormElementType\": \"checkbox\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"0 - 4 years\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"0 - 4 years\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"5 - 12 years\",\r\n" + 
				"          \"booleanValue\": true,\r\n" + 
				"          \"textValue\": \"5 - 12 years\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"13 - 18 years\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"13 - 18 years\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"19 - 59 years\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"19 - 59 years\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"60 - 64 years\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"60 - 64 years\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"65 years or older\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"65 years or older\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"household\": [\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 6,\r\n" + 
				"      \"quesText\": \"Does anyone in your household require a level of care compatable to the level provided in a nursing facility?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 7,\r\n" + 
				"      \"quesText\": \"Does anyone in your household have intellectual and/or developmental disability?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 8,\r\n" + 
				"      \"quesText\": \"Does anyone in your household required or receive the type of in-home care which is usually provided in a medical or psychiatric hospital and/or nursing facility?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 9,\r\n" + 
				"      \"quesText\": \"Is any adult in the household the parent of a minor child?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 10,\r\n" + 
				"      \"quesText\": \"Does anyone in your household attend school?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 11,\r\n" + 
				"      \"quesText\": \"If yes, what type of school:\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"\",\r\n" + 
				"      \"quesFormElementType\": \"checkbox\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Elementary School\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Elementary School\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Middle School\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Middle School\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"High School\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"High School\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"College, University, or Vocational School\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"College, University, or Vocational School\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"School for people with disabilities\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"School for people with disabilities\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Other\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Other\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 12,\r\n" + 
				"      \"quesText\": \"How much does the household pay for the rent/mortgage per month?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"0.00\",\r\n" + 
				"      \"quesFormElementType\": \"text\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"mortgagePerMonth\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 13,\r\n" + 
				"      \"quesText\": \"Is anyone in household billed seperately for heating or cooling expenses?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 14,\r\n" + 
				"      \"quesText\": \"Does the household pay for other utilities?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 15,\r\n" + 
				"      \"quesText\": \"If yes, how many?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"\",\r\n" + 
				"      \"quesFormElementType\": \"radio\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Yes\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"No\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 26,\r\n" + 
				"      \"quesText\": \"Does anyone in your household have an existing Spousal Support order?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 27,\r\n" + 
				"      \"quesText\": \"Is any child in the household under court supervision or identified as special needs (Y/N) *\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 28,\r\n" + 
				"      \"quesText\": \"Are the children needing child care US Citizens or Qualified Aliens?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"household\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"health\": [\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 16,\r\n" + 
				"      \"quesText\": \"Is anyone pregnant?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"health\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 17,\r\n" + 
				"      \"quesText\": \"Is anyone disabled?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"health\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 18,\r\n" + 
				"      \"quesText\": \"Is any one blind?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"health\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 19,\r\n" + 
				"      \"quesText\": \"Does anyone in the household have Medicare (Red, White, and Blue card)?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"health\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"N\",\r\n" + 
				"      \"quesFormElementType\": \"select\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"Yes\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"Y\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"No\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"N\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"income\": [\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 20,\r\n" + 
				"      \"quesText\": \"How much money does the household earn per month?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"income\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"1000.00\",\r\n" + 
				"      \"quesFormElementType\": \"text\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"moneyPerMonth\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 21,\r\n" + 
				"      \"quesText\": \"How much money does the household get other than earnings per month?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"income\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"500.00\",\r\n" + 
				"      \"quesFormElementType\": \"text\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"otherEarnings\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 22,\r\n" + 
				"      \"quesText\": \"How much does the household pay for child/adult care per month?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"income\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"0.00\",\r\n" + 
				"      \"quesFormElementType\": \"text\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"childCare\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 23,\r\n" + 
				"      \"quesText\": \"How much does the household pay for medical expenses for individuals 60 and older and/or disabled individuals per month?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"income\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"0.00\",\r\n" + 
				"      \"quesFormElementType\": \"text\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"expenseForIndividuals\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 24,\r\n" + 
				"      \"quesText\": \"How much does the household pay for child support for children outside the home per month?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"income\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"0.00\",\r\n" + 
				"      \"quesFormElementType\": \"text\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"childSupport\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"quesId\": 25,\r\n" + 
				"      \"quesText\": \"What is the total value of the household's assets?\",\r\n" + 
				"      \"quesCategory\": \"BF\",\r\n" + 
				"      \"quesCategorySection\": \"income\",\r\n" + 
				"      \"quesRequiredInd\": \"Y\",\r\n" + 
				"      \"value\": \"0.00\",\r\n" + 
				"      \"quesFormElementType\": \"text\",\r\n" + 
				"      \"benefitQuestionOptions\": [\r\n" + 
				"        {\r\n" + 
				"          \"name\": \"householdsAsset\",\r\n" + 
				"          \"booleanValue\": false,\r\n" + 
				"          \"textValue\": \"\",\r\n" + 
				"          \"sortOrder\": 0\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"quesOrder\": 0\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
	}

