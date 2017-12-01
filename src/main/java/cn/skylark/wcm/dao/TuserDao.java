package cn.skylark.wcm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.skylark.wcm.entity.Tuser;
/**
*  @author author
*/
public interface TuserDao {

    //生成代码开始 don't delete

    int insertTuser(Tuser object);

    int updateTuser(Tuser object);

    List<Tuser> queryTuser(Tuser object);

    Tuser queryTuserLimit1(Tuser object);
    //生成代码结束 don't delete
}