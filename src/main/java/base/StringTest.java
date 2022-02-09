package base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class StringTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringTest.class);

    @Test
    public void test1(){
        String s = "children_cnt:0 rate_plan_supplier:RA1DER channel:ODIGEO res_id_channel:9312a9cbfa47af13145552 type:perf_accor check_out:2022-02-13 00:00:00.000 res_id_derby:DM209074107CDQ12LASAN adult_cnt:1 consumed_timestamp:2022-02-09 07:41:11.711 supplier:ACCOR hotel_supplier:1434 host:172.26.77.103 process_result:Success process:Book check_in:2022-02-12 00:00:00.000 echo_token:953c28d9471a4f829287d8ad8a3c7b28 app_name:accor-reservation perf_version:v2 process_duration:2,142 @timestamp:2022-02-09 07:41:07.378 room_cnt:1 room_type_supplier:DBD region:us-west-2 _id:perf_accor_raw+1+154019 _type:doc _index:derbysoft-accor-v2-20220209 _score: - range:3 stay:1.children_cnt:0 rate_plan_supplier:RA1DER channel:ODIGEO res_id_channel:9312a9cbfa47af13145552 type:perf_accor check_out:2022-02-13 00:00:00.000 res_id_derby:DM209074107CDQ12LASAN adult_cnt:1 consumed_timestamp:2022-02-09 07:41:11.711 supplier:ACCOR hotel_supplier:1434 host:172.26.77.103 process_result:Success process:Book check_in:2022-02-12 00:00:00.000 echo_token:953c28d9471a4f829287d8ad8a3c7b28 app_name:accor-reservation perf_version:v2 process_duration:2,142 @timestamp:2022-02-09 07:41:07.378 room_cnt:1 room_type_supplier:DBD region:us-west-2 _id:perf_accor_raw+1+154019 _type:doc _index:derbysoft-accor-v2-20220209 _score: - range:3 stay:1";

        String s1 = "leo";
        int length = s1.length();
        int i = 10;
        String format = String.format("My Company name is %s %s", s1,i);
        System.out.println(format);
        //System.out.println(s.length());
    }

}
