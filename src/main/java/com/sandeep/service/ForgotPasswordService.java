package com.sandeep.service;

import com.sandeep.domain.VerificationType;
import com.sandeep.model.ForgotPasswordToken;
import com.sandeep.model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
