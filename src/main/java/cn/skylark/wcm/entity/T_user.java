package packageModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class T_user {

    //生成代码开始 don't delete


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String account;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String password;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer account_type;

    /**
    * 
    * isNullAble:1,defaultVal:0.00
    */
    private java.math.BigDecimal balance;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String nick_name;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String mobile_no;

    /**
    * 
    * isNullAble:1
    */
    private String recommend_mobile_no;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate reg_time;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate last_modify_time;

    /**
    * 
    * isNullAble:1,defaultVal:1
    */
    private Integer status;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String client_id;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String avatar;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String account_desc;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String signature;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer sex;

    /**
    * 
    * isNullAble:1,defaultVal:1
    */
    private Integer vip;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDate last_login_time;

    /**
    * 经度
    * isNullAble:1
    */
    private java.math.BigDecimal last_login_lon;

    /**
    * 纬度
    * isNullAble:1
    */
    private java.math.BigDecimal last_login_lat;

    /**
    * 1未开2开
    * isNullAble:0,defaultVal:1
    */
    private Integer open_push;

    /**
    * 1没开2开
    * isNullAble:0,defaultVal:1
    */
    private Integer open_sound;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String openid;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public String getAccount(){
        return this.account;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setAccount_type(Integer account_type){
        this.account_type = account_type;
    }

    public Integer getAccount_type(){
        return this.account_type;
    }

    public void setBalance(java.math.BigDecimal balance){
        this.balance = balance;
    }

    public java.math.BigDecimal getBalance(){
        return this.balance;
    }

    public void setNick_name(String nick_name){
        this.nick_name = nick_name;
    }

    public String getNick_name(){
        return this.nick_name;
    }

    public void setMobile_no(String mobile_no){
        this.mobile_no = mobile_no;
    }

    public String getMobile_no(){
        return this.mobile_no;
    }

    public void setRecommend_mobile_no(String recommend_mobile_no){
        this.recommend_mobile_no = recommend_mobile_no;
    }

    public String getRecommend_mobile_no(){
        return this.recommend_mobile_no;
    }

    public void setReg_time(java.time.LocalDate reg_time){
        this.reg_time = reg_time;
    }

    public java.time.LocalDate getReg_time(){
        return this.reg_time;
    }

    public void setLast_modify_time(java.time.LocalDate last_modify_time){
        this.last_modify_time = last_modify_time;
    }

    public java.time.LocalDate getLast_modify_time(){
        return this.last_modify_time;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setClient_id(String client_id){
        this.client_id = client_id;
    }

    public String getClient_id(){
        return this.client_id;
    }

    public void setAvatar(String avatar){
        this.avatar = avatar;
    }

    public String getAvatar(){
        return this.avatar;
    }

    public void setAccount_desc(String account_desc){
        this.account_desc = account_desc;
    }

    public String getAccount_desc(){
        return this.account_desc;
    }

    public void setSignature(String signature){
        this.signature = signature;
    }

    public String getSignature(){
        return this.signature;
    }

    public void setSex(Integer sex){
        this.sex = sex;
    }

    public Integer getSex(){
        return this.sex;
    }

    public void setVip(Integer vip){
        this.vip = vip;
    }

    public Integer getVip(){
        return this.vip;
    }

    public void setLast_login_time(java.time.LocalDate last_login_time){
        this.last_login_time = last_login_time;
    }

    public java.time.LocalDate getLast_login_time(){
        return this.last_login_time;
    }

    public void setLast_login_lon(java.math.BigDecimal last_login_lon){
        this.last_login_lon = last_login_lon;
    }

    public java.math.BigDecimal getLast_login_lon(){
        return this.last_login_lon;
    }

    public void setLast_login_lat(java.math.BigDecimal last_login_lat){
        this.last_login_lat = last_login_lat;
    }

    public java.math.BigDecimal getLast_login_lat(){
        return this.last_login_lat;
    }

    public void setOpen_push(Integer open_push){
        this.open_push = open_push;
    }

    public Integer getOpen_push(){
        return this.open_push;
    }

    public void setOpen_sound(Integer open_sound){
        this.open_sound = open_sound;
    }

    public Integer getOpen_sound(){
        return this.open_sound;
    }

    public void setOpenid(String openid){
        this.openid = openid;
    }

    public String getOpenid(){
        return this.openid;
    }
    @Override
    public String toString() {
        return "T_user{" +
                "id='" + id + '\'' +
                "account='" + account + '\'' +
                "password='" + password + '\'' +
                "account_type='" + account_type + '\'' +
                "balance='" + balance + '\'' +
                "nick_name='" + nick_name + '\'' +
                "mobile_no='" + mobile_no + '\'' +
                "recommend_mobile_no='" + recommend_mobile_no + '\'' +
                "reg_time='" + reg_time + '\'' +
                "last_modify_time='" + last_modify_time + '\'' +
                "status='" + status + '\'' +
                "client_id='" + client_id + '\'' +
                "avatar='" + avatar + '\'' +
                "account_desc='" + account_desc + '\'' +
                "signature='" + signature + '\'' +
                "sex='" + sex + '\'' +
                "vip='" + vip + '\'' +
                "last_login_time='" + last_login_time + '\'' +
                "last_login_lon='" + last_login_lon + '\'' +
                "last_login_lat='" + last_login_lat + '\'' +
                "open_push='" + open_push + '\'' +
                "open_sound='" + open_sound + '\'' +
                "openid='" + openid + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends T_user{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> idList;

        private List<String> accountList;

        private List<String> passwordList;

        private List<Integer> account_typeList;

        private List<java.math.BigDecimal> balanceList;

        private List<String> nick_nameList;

        private List<String> mobile_noList;

        private List<String> recommend_mobile_noList;

        private List<java.time.LocalDate> reg_timeList;

        private java.time.LocalDate reg_timeSt;

        private java.time.LocalDate reg_timeEd;

        public java.time.LocalDate getReg_timeSt(){
            return this.reg_timeSt;
        }

        public java.time.LocalDate getReg_timeEd(){
        return this.reg_timeEd;
        }
        private List<java.time.LocalDate> last_modify_timeList;

        private java.time.LocalDate last_modify_timeSt;

        private java.time.LocalDate last_modify_timeEd;

        public java.time.LocalDate getLast_modify_timeSt(){
            return this.last_modify_timeSt;
        }

        public java.time.LocalDate getLast_modify_timeEd(){
        return this.last_modify_timeEd;
        }
        private List<Integer> statusList;

        private List<String> client_idList;

        private List<String> avatarList;

        private List<String> account_descList;

        private List<String> signatureList;

        private List<Integer> sexList;

        private List<Integer> vipList;

        private List<java.time.LocalDate> last_login_timeList;

        private java.time.LocalDate last_login_timeSt;

        private java.time.LocalDate last_login_timeEd;

        public java.time.LocalDate getLast_login_timeSt(){
            return this.last_login_timeSt;
        }

        public java.time.LocalDate getLast_login_timeEd(){
        return this.last_login_timeEd;
        }
        private List<java.math.BigDecimal> last_login_lonList;

        private List<java.math.BigDecimal> last_login_latList;

        private List<Integer> open_pushList;

        private List<Integer> open_soundList;

        private List<String> openidList;

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = Arrays.asList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }



        public QueryBuilder account(String account){
            setAccount(account);
            return this;
        }

        public QueryBuilder accountList(String ... account){
            this.accountList = Arrays.asList(account);
            return this;
        }

        public QueryBuilder accountList(List<String> account){
            this.accountList = account;
            return this;
        }

        public QueryBuilder fetchAccount(){
            setFetchFields("fetchFields","account");
            return this;
        }

        public QueryBuilder excludeAccount(){
            setFetchFields("excludeFields","account");
            return this;
        }



        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = Arrays.asList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }



        public QueryBuilder account_type(Integer account_type){
            setAccount_type(account_type);
            return this;
        }

        public QueryBuilder account_typeList(Integer ... account_type){
            this.account_typeList = Arrays.asList(account_type);
            return this;
        }

        public QueryBuilder account_typeList(List<Integer> account_type){
            this.account_typeList = account_type;
            return this;
        }

        public QueryBuilder fetchAccount_type(){
            setFetchFields("fetchFields","account_type");
            return this;
        }

        public QueryBuilder excludeAccount_type(){
            setFetchFields("excludeFields","account_type");
            return this;
        }



        public QueryBuilder balance(java.math.BigDecimal balance){
            setBalance(balance);
            return this;
        }

        public QueryBuilder balanceList(java.math.BigDecimal ... balance){
            this.balanceList = Arrays.asList(balance);
            return this;
        }

        public QueryBuilder balanceList(List<java.math.BigDecimal> balance){
            this.balanceList = balance;
            return this;
        }

        public QueryBuilder fetchBalance(){
            setFetchFields("fetchFields","balance");
            return this;
        }

        public QueryBuilder excludeBalance(){
            setFetchFields("excludeFields","balance");
            return this;
        }



        public QueryBuilder nick_name(String nick_name){
            setNick_name(nick_name);
            return this;
        }

        public QueryBuilder nick_nameList(String ... nick_name){
            this.nick_nameList = Arrays.asList(nick_name);
            return this;
        }

        public QueryBuilder nick_nameList(List<String> nick_name){
            this.nick_nameList = nick_name;
            return this;
        }

        public QueryBuilder fetchNick_name(){
            setFetchFields("fetchFields","nick_name");
            return this;
        }

        public QueryBuilder excludeNick_name(){
            setFetchFields("excludeFields","nick_name");
            return this;
        }



        public QueryBuilder mobile_no(String mobile_no){
            setMobile_no(mobile_no);
            return this;
        }

        public QueryBuilder mobile_noList(String ... mobile_no){
            this.mobile_noList = Arrays.asList(mobile_no);
            return this;
        }

        public QueryBuilder mobile_noList(List<String> mobile_no){
            this.mobile_noList = mobile_no;
            return this;
        }

        public QueryBuilder fetchMobile_no(){
            setFetchFields("fetchFields","mobile_no");
            return this;
        }

        public QueryBuilder excludeMobile_no(){
            setFetchFields("excludeFields","mobile_no");
            return this;
        }



        public QueryBuilder recommend_mobile_no(String recommend_mobile_no){
            setRecommend_mobile_no(recommend_mobile_no);
            return this;
        }

        public QueryBuilder recommend_mobile_noList(String ... recommend_mobile_no){
            this.recommend_mobile_noList = Arrays.asList(recommend_mobile_no);
            return this;
        }

        public QueryBuilder recommend_mobile_noList(List<String> recommend_mobile_no){
            this.recommend_mobile_noList = recommend_mobile_no;
            return this;
        }

        public QueryBuilder fetchRecommend_mobile_no(){
            setFetchFields("fetchFields","recommend_mobile_no");
            return this;
        }

        public QueryBuilder excludeRecommend_mobile_no(){
            setFetchFields("excludeFields","recommend_mobile_no");
            return this;
        }


        public QueryBuilder reg_timeBetWeen(java.time.LocalDate reg_timeSt,java.time.LocalDate reg_timeEd){
            this.reg_timeSt = reg_timeSt;
            this.reg_timeEd = reg_timeEd;
            return this;
        }

        public QueryBuilder reg_time(java.time.LocalDate reg_time){
            setReg_time(reg_time);
            return this;
        }

        public QueryBuilder reg_timeList(java.time.LocalDate ... reg_time){
            this.reg_timeList = Arrays.asList(reg_time);
            return this;
        }

        public QueryBuilder reg_timeList(List<java.time.LocalDate> reg_time){
            this.reg_timeList = reg_time;
            return this;
        }

        public QueryBuilder fetchReg_time(){
            setFetchFields("fetchFields","reg_time");
            return this;
        }

        public QueryBuilder excludeReg_time(){
            setFetchFields("excludeFields","reg_time");
            return this;
        }


        public QueryBuilder last_modify_timeBetWeen(java.time.LocalDate last_modify_timeSt,java.time.LocalDate last_modify_timeEd){
            this.last_modify_timeSt = last_modify_timeSt;
            this.last_modify_timeEd = last_modify_timeEd;
            return this;
        }

        public QueryBuilder last_modify_time(java.time.LocalDate last_modify_time){
            setLast_modify_time(last_modify_time);
            return this;
        }

        public QueryBuilder last_modify_timeList(java.time.LocalDate ... last_modify_time){
            this.last_modify_timeList = Arrays.asList(last_modify_time);
            return this;
        }

        public QueryBuilder last_modify_timeList(List<java.time.LocalDate> last_modify_time){
            this.last_modify_timeList = last_modify_time;
            return this;
        }

        public QueryBuilder fetchLast_modify_time(){
            setFetchFields("fetchFields","last_modify_time");
            return this;
        }

        public QueryBuilder excludeLast_modify_time(){
            setFetchFields("excludeFields","last_modify_time");
            return this;
        }



        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = Arrays.asList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }



        public QueryBuilder client_id(String client_id){
            setClient_id(client_id);
            return this;
        }

        public QueryBuilder client_idList(String ... client_id){
            this.client_idList = Arrays.asList(client_id);
            return this;
        }

        public QueryBuilder client_idList(List<String> client_id){
            this.client_idList = client_id;
            return this;
        }

        public QueryBuilder fetchClient_id(){
            setFetchFields("fetchFields","client_id");
            return this;
        }

        public QueryBuilder excludeClient_id(){
            setFetchFields("excludeFields","client_id");
            return this;
        }



        public QueryBuilder avatar(String avatar){
            setAvatar(avatar);
            return this;
        }

        public QueryBuilder avatarList(String ... avatar){
            this.avatarList = Arrays.asList(avatar);
            return this;
        }

        public QueryBuilder avatarList(List<String> avatar){
            this.avatarList = avatar;
            return this;
        }

        public QueryBuilder fetchAvatar(){
            setFetchFields("fetchFields","avatar");
            return this;
        }

        public QueryBuilder excludeAvatar(){
            setFetchFields("excludeFields","avatar");
            return this;
        }



        public QueryBuilder account_desc(String account_desc){
            setAccount_desc(account_desc);
            return this;
        }

        public QueryBuilder account_descList(String ... account_desc){
            this.account_descList = Arrays.asList(account_desc);
            return this;
        }

        public QueryBuilder account_descList(List<String> account_desc){
            this.account_descList = account_desc;
            return this;
        }

        public QueryBuilder fetchAccount_desc(){
            setFetchFields("fetchFields","account_desc");
            return this;
        }

        public QueryBuilder excludeAccount_desc(){
            setFetchFields("excludeFields","account_desc");
            return this;
        }



        public QueryBuilder signature(String signature){
            setSignature(signature);
            return this;
        }

        public QueryBuilder signatureList(String ... signature){
            this.signatureList = Arrays.asList(signature);
            return this;
        }

        public QueryBuilder signatureList(List<String> signature){
            this.signatureList = signature;
            return this;
        }

        public QueryBuilder fetchSignature(){
            setFetchFields("fetchFields","signature");
            return this;
        }

        public QueryBuilder excludeSignature(){
            setFetchFields("excludeFields","signature");
            return this;
        }



        public QueryBuilder sex(Integer sex){
            setSex(sex);
            return this;
        }

        public QueryBuilder sexList(Integer ... sex){
            this.sexList = Arrays.asList(sex);
            return this;
        }

        public QueryBuilder sexList(List<Integer> sex){
            this.sexList = sex;
            return this;
        }

        public QueryBuilder fetchSex(){
            setFetchFields("fetchFields","sex");
            return this;
        }

        public QueryBuilder excludeSex(){
            setFetchFields("excludeFields","sex");
            return this;
        }



        public QueryBuilder vip(Integer vip){
            setVip(vip);
            return this;
        }

        public QueryBuilder vipList(Integer ... vip){
            this.vipList = Arrays.asList(vip);
            return this;
        }

        public QueryBuilder vipList(List<Integer> vip){
            this.vipList = vip;
            return this;
        }

        public QueryBuilder fetchVip(){
            setFetchFields("fetchFields","vip");
            return this;
        }

        public QueryBuilder excludeVip(){
            setFetchFields("excludeFields","vip");
            return this;
        }


        public QueryBuilder last_login_timeBetWeen(java.time.LocalDate last_login_timeSt,java.time.LocalDate last_login_timeEd){
            this.last_login_timeSt = last_login_timeSt;
            this.last_login_timeEd = last_login_timeEd;
            return this;
        }

        public QueryBuilder last_login_time(java.time.LocalDate last_login_time){
            setLast_login_time(last_login_time);
            return this;
        }

        public QueryBuilder last_login_timeList(java.time.LocalDate ... last_login_time){
            this.last_login_timeList = Arrays.asList(last_login_time);
            return this;
        }

        public QueryBuilder last_login_timeList(List<java.time.LocalDate> last_login_time){
            this.last_login_timeList = last_login_time;
            return this;
        }

        public QueryBuilder fetchLast_login_time(){
            setFetchFields("fetchFields","last_login_time");
            return this;
        }

        public QueryBuilder excludeLast_login_time(){
            setFetchFields("excludeFields","last_login_time");
            return this;
        }



        public QueryBuilder last_login_lon(java.math.BigDecimal last_login_lon){
            setLast_login_lon(last_login_lon);
            return this;
        }

        public QueryBuilder last_login_lonList(java.math.BigDecimal ... last_login_lon){
            this.last_login_lonList = Arrays.asList(last_login_lon);
            return this;
        }

        public QueryBuilder last_login_lonList(List<java.math.BigDecimal> last_login_lon){
            this.last_login_lonList = last_login_lon;
            return this;
        }

        public QueryBuilder fetchLast_login_lon(){
            setFetchFields("fetchFields","last_login_lon");
            return this;
        }

        public QueryBuilder excludeLast_login_lon(){
            setFetchFields("excludeFields","last_login_lon");
            return this;
        }



        public QueryBuilder last_login_lat(java.math.BigDecimal last_login_lat){
            setLast_login_lat(last_login_lat);
            return this;
        }

        public QueryBuilder last_login_latList(java.math.BigDecimal ... last_login_lat){
            this.last_login_latList = Arrays.asList(last_login_lat);
            return this;
        }

        public QueryBuilder last_login_latList(List<java.math.BigDecimal> last_login_lat){
            this.last_login_latList = last_login_lat;
            return this;
        }

        public QueryBuilder fetchLast_login_lat(){
            setFetchFields("fetchFields","last_login_lat");
            return this;
        }

        public QueryBuilder excludeLast_login_lat(){
            setFetchFields("excludeFields","last_login_lat");
            return this;
        }



        public QueryBuilder open_push(Integer open_push){
            setOpen_push(open_push);
            return this;
        }

        public QueryBuilder open_pushList(Integer ... open_push){
            this.open_pushList = Arrays.asList(open_push);
            return this;
        }

        public QueryBuilder open_pushList(List<Integer> open_push){
            this.open_pushList = open_push;
            return this;
        }

        public QueryBuilder fetchOpen_push(){
            setFetchFields("fetchFields","open_push");
            return this;
        }

        public QueryBuilder excludeOpen_push(){
            setFetchFields("excludeFields","open_push");
            return this;
        }



        public QueryBuilder open_sound(Integer open_sound){
            setOpen_sound(open_sound);
            return this;
        }

        public QueryBuilder open_soundList(Integer ... open_sound){
            this.open_soundList = Arrays.asList(open_sound);
            return this;
        }

        public QueryBuilder open_soundList(List<Integer> open_sound){
            this.open_soundList = open_sound;
            return this;
        }

        public QueryBuilder fetchOpen_sound(){
            setFetchFields("fetchFields","open_sound");
            return this;
        }

        public QueryBuilder excludeOpen_sound(){
            setFetchFields("excludeFields","open_sound");
            return this;
        }



        public QueryBuilder openid(String openid){
            setOpenid(openid);
            return this;
        }

        public QueryBuilder openidList(String ... openid){
            this.openidList = Arrays.asList(openid);
            return this;
        }

        public QueryBuilder openidList(List<String> openid){
            this.openidList = openid;
            return this;
        }

        public QueryBuilder fetchOpenid(){
            setFetchFields("fetchFields","openid");
            return this;
        }

        public QueryBuilder excludeOpenid(){
            setFetchFields("excludeFields","openid");
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

        public T_user build(){
            return this;
        }
    }
    //生成代码结束 don't delete

}
