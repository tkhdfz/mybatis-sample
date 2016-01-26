package my.sample.domain.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.StringTypeHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@MappedTypes(String.class)
public class MyStringTypeHandler extends StringTypeHandler {


    @Override
    public void setParameter(PreparedStatement ps, int i, String parameter,
            JdbcType jdbcType) throws SQLException {

        if ("".equals(parameter)) {
            parameter = null;

            if (jdbcType == null) {
                // prameter, jdbcType がともに null だと TypeException がスローされる
                jdbcType = JdbcType.VARCHAR;
            }
        }

        super.setParameter(ps, i, parameter, jdbcType);

    }
}
