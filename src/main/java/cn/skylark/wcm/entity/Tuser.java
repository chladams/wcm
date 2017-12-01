package cn.skylark.wcm.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class Tuser {

    //生成代码开始 don't delete


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String cid;

    /**
    * 用户名
    * isNullAble:1
    */
    private String cusername;

    /**
    * 年龄
    * isNullAble:1
    */
    private Integer iuserage;

    /**
    * 是否党员
    * isNullAble:1,defaultVal:0
    */
    private Integer busercommunist;

    /**
    * 分数测试
    * isNullAble:1
    */
    private java.math.BigDecimal fuserscore;

    /**
    * 性别
    * isNullAble:1
    */
    private String suersex;

    /**
    * 自我介绍
    * isNullAble:1
    */
    private String ruserintroduce;

    /**
    * 用户头像
    * isNullAble:1
    */
    private String uuserphoto;

    /**
    * 生日
    * isNullAble:1
    */
    private java.time.LocalDate duserbirthday;

    /**
    * 
    * isNullAble:1,defaultVal:1
    */
    private Integer buserenable;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate tuseraddtime;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate tuserupdatetime;

    /**
    * 
    * isNullAble:1
    */
    private String muserremark;

    /**
    * 部门id
    * isNullAble:1
    */
    private String cuserdepartmentid;


    public void setCid(String cid){
        this.cid = cid;
    }

    public String getCid(){
        return this.cid;
    }

    public void setCusername(String cusername){
        this.cusername = cusername;
    }

    public String getCusername(){
        return this.cusername;
    }

    public void setIuserage(Integer iuserage){
        this.iuserage = iuserage;
    }

    public Integer getIuserage(){
        return this.iuserage;
    }

    public void setBusercommunist(Integer busercommunist){
        this.busercommunist = busercommunist;
    }

    public Integer getBusercommunist(){
        return this.busercommunist;
    }

    public void setFuserscore(java.math.BigDecimal fuserscore){
        this.fuserscore = fuserscore;
    }

    public java.math.BigDecimal getFuserscore(){
        return this.fuserscore;
    }

    public void setSuersex(String suersex){
        this.suersex = suersex;
    }

    public String getSuersex(){
        return this.suersex;
    }

    public void setRuserintroduce(String ruserintroduce){
        this.ruserintroduce = ruserintroduce;
    }

    public String getRuserintroduce(){
        return this.ruserintroduce;
    }

    public void setUuserphoto(String uuserphoto){
        this.uuserphoto = uuserphoto;
    }

    public String getUuserphoto(){
        return this.uuserphoto;
    }

    public void setDuserbirthday(java.time.LocalDate duserbirthday){
        this.duserbirthday = duserbirthday;
    }

    public java.time.LocalDate getDuserbirthday(){
        return this.duserbirthday;
    }

    public void setBuserenable(Integer buserenable){
        this.buserenable = buserenable;
    }

    public Integer getBuserenable(){
        return this.buserenable;
    }

    public void setTuseraddtime(java.time.LocalDate tuseraddtime){
        this.tuseraddtime = tuseraddtime;
    }

    public java.time.LocalDate getTuseraddtime(){
        return this.tuseraddtime;
    }

    public void setTuserupdatetime(java.time.LocalDate tuserupdatetime){
        this.tuserupdatetime = tuserupdatetime;
    }

    public java.time.LocalDate getTuserupdatetime(){
        return this.tuserupdatetime;
    }

    public void setMuserremark(String muserremark){
        this.muserremark = muserremark;
    }

    public String getMuserremark(){
        return this.muserremark;
    }

    public void setCuserdepartmentid(String cuserdepartmentid){
        this.cuserdepartmentid = cuserdepartmentid;
    }

    public String getCuserdepartmentid(){
        return this.cuserdepartmentid;
    }
    @Override
    public String toString() {
        return "Tuser{" +
                "cid='" + cid + '\'' +
                "cusername='" + cusername + '\'' +
                "iuserage='" + iuserage + '\'' +
                "busercommunist='" + busercommunist + '\'' +
                "fuserscore='" + fuserscore + '\'' +
                "suersex='" + suersex + '\'' +
                "ruserintroduce='" + ruserintroduce + '\'' +
                "uuserphoto='" + uuserphoto + '\'' +
                "duserbirthday='" + duserbirthday + '\'' +
                "buserenable='" + buserenable + '\'' +
                "tuseraddtime='" + tuseraddtime + '\'' +
                "tuserupdatetime='" + tuserupdatetime + '\'' +
                "muserremark='" + muserremark + '\'' +
                "cuserdepartmentid='" + cuserdepartmentid + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Tuser{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<String> cidList;

        private List<String> cusernameList;

        private List<Integer> iuserageList;

        private List<Integer> busercommunistList;

        private List<java.math.BigDecimal> fuserscoreList;

        private List<String> suersexList;

        private List<String> ruserintroduceList;

        private List<String> uuserphotoList;

        private List<java.time.LocalDate> duserbirthdayList;

        private java.time.LocalDate duserbirthdaySt;

        private java.time.LocalDate duserbirthdayEd;

        public java.time.LocalDate getDuserbirthdaySt(){
            return this.duserbirthdaySt;
        }

        public java.time.LocalDate getDuserbirthdayEd(){
        return this.duserbirthdayEd;
        }
        private List<Integer> buserenableList;

        private List<java.time.LocalDate> tuseraddtimeList;

        private java.time.LocalDate tuseraddtimeSt;

        private java.time.LocalDate tuseraddtimeEd;

        public java.time.LocalDate getTuseraddtimeSt(){
            return this.tuseraddtimeSt;
        }

        public java.time.LocalDate getTuseraddtimeEd(){
        return this.tuseraddtimeEd;
        }
        private List<java.time.LocalDate> tuserupdatetimeList;

        private java.time.LocalDate tuserupdatetimeSt;

        private java.time.LocalDate tuserupdatetimeEd;

        public java.time.LocalDate getTuserupdatetimeSt(){
            return this.tuserupdatetimeSt;
        }

        public java.time.LocalDate getTuserupdatetimeEd(){
        return this.tuserupdatetimeEd;
        }
        private List<String> muserremarkList;

        private List<String> cuserdepartmentidList;

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder cid(String cid){
            setCid(cid);
            return this;
        }

        public QueryBuilder cidList(String ... cid){
            this.cidList = Arrays.asList(cid);
            return this;
        }

        public QueryBuilder cidList(List<String> cid){
            this.cidList = cid;
            return this;
        }

        public QueryBuilder fetchCid(){
            setFetchFields("fetchFields","cid");
            return this;
        }

        public QueryBuilder excludeCid(){
            setFetchFields("excludeFields","cid");
            return this;
        }



        public QueryBuilder cusername(String cusername){
            setCusername(cusername);
            return this;
        }

        public QueryBuilder cusernameList(String ... cusername){
            this.cusernameList = Arrays.asList(cusername);
            return this;
        }

        public QueryBuilder cusernameList(List<String> cusername){
            this.cusernameList = cusername;
            return this;
        }

        public QueryBuilder fetchCusername(){
            setFetchFields("fetchFields","cusername");
            return this;
        }

        public QueryBuilder excludeCusername(){
            setFetchFields("excludeFields","cusername");
            return this;
        }



        public QueryBuilder iuserage(Integer iuserage){
            setIuserage(iuserage);
            return this;
        }

        public QueryBuilder iuserageList(Integer ... iuserage){
            this.iuserageList = Arrays.asList(iuserage);
            return this;
        }

        public QueryBuilder iuserageList(List<Integer> iuserage){
            this.iuserageList = iuserage;
            return this;
        }

        public QueryBuilder fetchIuserage(){
            setFetchFields("fetchFields","iuserage");
            return this;
        }

        public QueryBuilder excludeIuserage(){
            setFetchFields("excludeFields","iuserage");
            return this;
        }



        public QueryBuilder busercommunist(Integer busercommunist){
            setBusercommunist(busercommunist);
            return this;
        }

        public QueryBuilder busercommunistList(Integer ... busercommunist){
            this.busercommunistList = Arrays.asList(busercommunist);
            return this;
        }

        public QueryBuilder busercommunistList(List<Integer> busercommunist){
            this.busercommunistList = busercommunist;
            return this;
        }

        public QueryBuilder fetchBusercommunist(){
            setFetchFields("fetchFields","busercommunist");
            return this;
        }

        public QueryBuilder excludeBusercommunist(){
            setFetchFields("excludeFields","busercommunist");
            return this;
        }



        public QueryBuilder fuserscore(java.math.BigDecimal fuserscore){
            setFuserscore(fuserscore);
            return this;
        }

        public QueryBuilder fuserscoreList(java.math.BigDecimal ... fuserscore){
            this.fuserscoreList = Arrays.asList(fuserscore);
            return this;
        }

        public QueryBuilder fuserscoreList(List<java.math.BigDecimal> fuserscore){
            this.fuserscoreList = fuserscore;
            return this;
        }

        public QueryBuilder fetchFuserscore(){
            setFetchFields("fetchFields","fuserscore");
            return this;
        }

        public QueryBuilder excludeFuserscore(){
            setFetchFields("excludeFields","fuserscore");
            return this;
        }



        public QueryBuilder suersex(String suersex){
            setSuersex(suersex);
            return this;
        }

        public QueryBuilder suersexList(String ... suersex){
            this.suersexList = Arrays.asList(suersex);
            return this;
        }

        public QueryBuilder suersexList(List<String> suersex){
            this.suersexList = suersex;
            return this;
        }

        public QueryBuilder fetchSuersex(){
            setFetchFields("fetchFields","suersex");
            return this;
        }

        public QueryBuilder excludeSuersex(){
            setFetchFields("excludeFields","suersex");
            return this;
        }



        public QueryBuilder ruserintroduce(String ruserintroduce){
            setRuserintroduce(ruserintroduce);
            return this;
        }

        public QueryBuilder ruserintroduceList(String ... ruserintroduce){
            this.ruserintroduceList = Arrays.asList(ruserintroduce);
            return this;
        }

        public QueryBuilder ruserintroduceList(List<String> ruserintroduce){
            this.ruserintroduceList = ruserintroduce;
            return this;
        }

        public QueryBuilder fetchRuserintroduce(){
            setFetchFields("fetchFields","ruserintroduce");
            return this;
        }

        public QueryBuilder excludeRuserintroduce(){
            setFetchFields("excludeFields","ruserintroduce");
            return this;
        }



        public QueryBuilder uuserphoto(String uuserphoto){
            setUuserphoto(uuserphoto);
            return this;
        }

        public QueryBuilder uuserphotoList(String ... uuserphoto){
            this.uuserphotoList = Arrays.asList(uuserphoto);
            return this;
        }

        public QueryBuilder uuserphotoList(List<String> uuserphoto){
            this.uuserphotoList = uuserphoto;
            return this;
        }

        public QueryBuilder fetchUuserphoto(){
            setFetchFields("fetchFields","uuserphoto");
            return this;
        }

        public QueryBuilder excludeUuserphoto(){
            setFetchFields("excludeFields","uuserphoto");
            return this;
        }


        public QueryBuilder duserbirthdayBetWeen(java.time.LocalDate duserbirthdaySt,java.time.LocalDate duserbirthdayEd){
            this.duserbirthdaySt = duserbirthdaySt;
            this.duserbirthdayEd = duserbirthdayEd;
            return this;
        }

        public QueryBuilder duserbirthday(java.time.LocalDate duserbirthday){
            setDuserbirthday(duserbirthday);
            return this;
        }

        public QueryBuilder duserbirthdayList(java.time.LocalDate ... duserbirthday){
            this.duserbirthdayList = Arrays.asList(duserbirthday);
            return this;
        }

        public QueryBuilder duserbirthdayList(List<java.time.LocalDate> duserbirthday){
            this.duserbirthdayList = duserbirthday;
            return this;
        }

        public QueryBuilder fetchDuserbirthday(){
            setFetchFields("fetchFields","duserbirthday");
            return this;
        }

        public QueryBuilder excludeDuserbirthday(){
            setFetchFields("excludeFields","duserbirthday");
            return this;
        }



        public QueryBuilder buserenable(Integer buserenable){
            setBuserenable(buserenable);
            return this;
        }

        public QueryBuilder buserenableList(Integer ... buserenable){
            this.buserenableList = Arrays.asList(buserenable);
            return this;
        }

        public QueryBuilder buserenableList(List<Integer> buserenable){
            this.buserenableList = buserenable;
            return this;
        }

        public QueryBuilder fetchBuserenable(){
            setFetchFields("fetchFields","buserenable");
            return this;
        }

        public QueryBuilder excludeBuserenable(){
            setFetchFields("excludeFields","buserenable");
            return this;
        }


        public QueryBuilder tuseraddtimeBetWeen(java.time.LocalDate tuseraddtimeSt,java.time.LocalDate tuseraddtimeEd){
            this.tuseraddtimeSt = tuseraddtimeSt;
            this.tuseraddtimeEd = tuseraddtimeEd;
            return this;
        }

        public QueryBuilder tuseraddtime(java.time.LocalDate tuseraddtime){
            setTuseraddtime(tuseraddtime);
            return this;
        }

        public QueryBuilder tuseraddtimeList(java.time.LocalDate ... tuseraddtime){
            this.tuseraddtimeList = Arrays.asList(tuseraddtime);
            return this;
        }

        public QueryBuilder tuseraddtimeList(List<java.time.LocalDate> tuseraddtime){
            this.tuseraddtimeList = tuseraddtime;
            return this;
        }

        public QueryBuilder fetchTuseraddtime(){
            setFetchFields("fetchFields","tuseraddtime");
            return this;
        }

        public QueryBuilder excludeTuseraddtime(){
            setFetchFields("excludeFields","tuseraddtime");
            return this;
        }


        public QueryBuilder tuserupdatetimeBetWeen(java.time.LocalDate tuserupdatetimeSt,java.time.LocalDate tuserupdatetimeEd){
            this.tuserupdatetimeSt = tuserupdatetimeSt;
            this.tuserupdatetimeEd = tuserupdatetimeEd;
            return this;
        }

        public QueryBuilder tuserupdatetime(java.time.LocalDate tuserupdatetime){
            setTuserupdatetime(tuserupdatetime);
            return this;
        }

        public QueryBuilder tuserupdatetimeList(java.time.LocalDate ... tuserupdatetime){
            this.tuserupdatetimeList = Arrays.asList(tuserupdatetime);
            return this;
        }

        public QueryBuilder tuserupdatetimeList(List<java.time.LocalDate> tuserupdatetime){
            this.tuserupdatetimeList = tuserupdatetime;
            return this;
        }

        public QueryBuilder fetchTuserupdatetime(){
            setFetchFields("fetchFields","tuserupdatetime");
            return this;
        }

        public QueryBuilder excludeTuserupdatetime(){
            setFetchFields("excludeFields","tuserupdatetime");
            return this;
        }



        public QueryBuilder muserremark(String muserremark){
            setMuserremark(muserremark);
            return this;
        }

        public QueryBuilder muserremarkList(String ... muserremark){
            this.muserremarkList = Arrays.asList(muserremark);
            return this;
        }

        public QueryBuilder muserremarkList(List<String> muserremark){
            this.muserremarkList = muserremark;
            return this;
        }

        public QueryBuilder fetchMuserremark(){
            setFetchFields("fetchFields","muserremark");
            return this;
        }

        public QueryBuilder excludeMuserremark(){
            setFetchFields("excludeFields","muserremark");
            return this;
        }



        public QueryBuilder cuserdepartmentid(String cuserdepartmentid){
            setCuserdepartmentid(cuserdepartmentid);
            return this;
        }

        public QueryBuilder cuserdepartmentidList(String ... cuserdepartmentid){
            this.cuserdepartmentidList = Arrays.asList(cuserdepartmentid);
            return this;
        }

        public QueryBuilder cuserdepartmentidList(List<String> cuserdepartmentid){
            this.cuserdepartmentidList = cuserdepartmentid;
            return this;
        }

        public QueryBuilder fetchCuserdepartmentid(){
            setFetchFields("fetchFields","cuserdepartmentid");
            return this;
        }

        public QueryBuilder excludeCuserdepartmentid(){
            setFetchFields("excludeFields","cuserdepartmentid");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            this.fetchFields.put("otherFields",Arrays.asList(fields));
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.getOrDefault(key,new HashMap<>());
            fields.put(val,true);
            this.fetchFields.putIfAbsent(key,fields);
        }

        public Tuser build(){
            return this;
        }
    }
    //生成代码结束 don't delete

}
