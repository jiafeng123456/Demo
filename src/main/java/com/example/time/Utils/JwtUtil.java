package com.example.time.Utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/6 0006 11:25
 */
public class JwtUtil {
    //过期时间
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    //私钥
    private static final String TOKEN_SECRET = "privateKey";

    /**
     * 生成签名，15分钟过期
     * @param **username**
     * @param **password**
     * @return
     */
    public static String sign(Long userId) {
        try {
            // 设置过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("Type", "Jwt");
            header.put("alg", "HS256");
            // 返回token字符串
            return JWT.create()
                    .withHeader(header)
                    .withClaim("userId", userId)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 检验token是否正确
     * @param **token**
     * @return
     */
    public static Long verify(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            Long userId = jwt.getClaim("userId").asLong();
            return userId;
        } catch (Exception e){
            return 0L;
        }
    }

    public static void main(String[] args) {
        String token = sign(1234567894L);
        System.out.println(token);
        System.out.println(verify(token));
    }
}
