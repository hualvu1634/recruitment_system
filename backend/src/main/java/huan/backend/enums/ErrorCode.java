package huan.backend.enums;

import lombok.Getter;

@Getter
public enum ErrorCode {
    INTERNAL_SERVER_ERROR(500, "Lỗi hệ thống"),
    USER_EXISTED(400, "Tài khoản đã tồn tại"),
    USER_NOT_FOUND(404, "Không tìm thấy người dùng"),
    AUTH_FAILED(401, "Email hoặc mật khẩu không chính xác"),
    ACCOUNT_LOCKED(403, "Tài khoản đã bị khóa"),
    NOT_NULL(400, "Không được để trống"),
    INVALID_SIZE(400, "Độ dài ký tự không hợp lệ"),
    INVALID_MIN(400, "Giá trị đầu vào không hợp lệ"),
    INVALID_PHONE(400, "Định dạng số điện thoại không hợp lệ"),
    UNAUTHORIZED(403, "Không có quyền");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}