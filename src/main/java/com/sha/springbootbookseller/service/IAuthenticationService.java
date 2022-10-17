package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJwt(User signInRequest);
}
