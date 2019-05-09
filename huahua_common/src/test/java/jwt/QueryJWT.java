package jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/25
 * \* Time: 20:51
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class QueryJWT {
    public static void main(String[] args) {
        //token 令牌
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiLpq5jpk4nnkKrojYnms6XpqawiLCJpYXQiOjE1NTYyNDA0MjJ9.9Z62vmycM4ZklbLerkillU-DBaSVJKRR0jLP30qNQIM";
        try {
            Claims body = Jwts.parser().setSigningKey("huahuaCommunity")
                    .parseClaimsJws(token).getBody();
            System.out.println("用户的id:"+body.getId());
            System.out.println("用户角色:"+body.get("roles"));
            System.out.println("用户手机号:"+body.get("telphone"));
            System.out.println("用户的名称:"+body.getSubject());
            System.out.println("系统时间:"+new Date());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            System.out.println("过期时间:"+sdf.format(body.getExpiration()));
            System.out.println("签发时间:"+sdf.format(body.getIssuedAt()));
        }catch (Exception e){
            System.out.println("签名认证失效，请重新获取");
        }



    }

}
