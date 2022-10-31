package com.rcb.rck.common;

import com.rcb.rck.exception.RckException;
import com.rcb.rck.exception.RckExceptionEnum;
import io.lettuce.core.internal.LettuceSets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Constant {
    public static final String SALT="11111";
    public static final String RCK_USER="rck_user";

    public static String FILE_UPLOAD_DIR;


    //spring 注入value 类应加@Component注解
    @Value("${file.upload.dir}")
    public void setFileUploadDir(String fileUploadDir){
        FILE_UPLOAD_DIR = fileUploadDir;
    }

    public enum RcInfo{
        BOY(1, "男"),
        GIRL(2, "女"),
        EDUCATION_CZ(10, "初中"),
        EDUCATION_GZ(11, "高中"),
        EDUCATION_ZZ(12, "中专"),
        EDUCATION_DZ(13, "大专"),
        EDUCATION_BK(14, "本科"),
        EDUCATION_YJS(15, "研究生"),
        UNIT_XSQ(16, "县（市、区）"),
        UNIT_SZ(17, "市直部门"),
        UNIT_GX(18, "驻保高校"),
        UNIT_KFQ(19, "开发区"),
        LEVEL_2(20, "二级宣传专员"),
        LEVEL_21(21, "人才办主任"),
        LEVEL_22(22, "市直部门责任处室负责人"),
        LEVEL_23(23, "开发区人力资源部门负责人"),
        LEVEL_24(24, "市属和驻保高校就业创业中心主任或校团委书记"),
        LEVEL_3(30, "三级宣传专员"),
        LEVEL_31(31, "乡镇（街道）组织委员"),
        LEVEL_32(32, "市属部门下属单位责任处（科）室负责人"),
        LEVEL_33(33, "二级学院学生就业部门负责人或院团委书记"),
        LEVEL_34(34, "规模较大的规上企业人力资源部门负责人"),
        LEVEL_4(40, "四级宣传专员"),
        LEVEL_41(41, "村（社区）"),
        LEVEL_42(42, "二级学院各系（专业）负责学生党务或学生工作的人员"),
        LEVEL_43(42, "规模较大的规上企业分公司人力资源部门负责人");


        private int code;
        private String value;

        RcInfo(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public static RcInfo codeOf(Integer code){
            for (RcInfo orderStatusNum: values()){
                if (orderStatusNum.getCode() == code){
                    return orderStatusNum;
                }
            }
            throw new RckException(RckExceptionEnum.ERROR_ENUM);
        }
    }

}
