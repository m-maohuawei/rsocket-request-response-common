package com.ms.common.user.registered;


import com.ms.common.base.BaseResponse;
import com.ms.common.base.IBaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisteredPhonenumberResponse   extends BaseResponse {

    private String access_token;
    private String refresh_token;

}
