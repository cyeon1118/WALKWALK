package org.ssafy.d210._common.response;

import lombok.Getter;

@Getter
public enum MsgType {

    // ====================== USER ============================
    SIGNUP_SUCCESSFULLY("회원가입이 완료되었습니다!"),

    // ====================== File Upload =====================
    UPLOAD_FILE_SUCCESSFULLY("파일 업로드를 성공적으로 했습니다.");

    private final String msg;

    MsgType(String msg) {
        this.msg =msg;
    }
}