package com.example.messagerestserver.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class TBT_DATA_ALL {
    @Id
    String RU_ID;
    String RU_NAME;
    String DU_NAME;
    String HDQT_NAME;
    String TEAM_NAME;
    String CITY;
    String DISTRICT;
    String DONG;
    String BOARD_NAME;
    String SITE_ID;
    String RU_5G_CNT;
    String RU_LTE_CNT;
    String ELECTRIC_GUBUN_NAME;
    String ELECTRIC_RATE_GB_NAME;
    String F_ELECTRIC_RATE_GB_NAME;
    String MODEL_INPPOWER;
    String CURRENT_TIME;
    String CURRENT_PRB_DL;
    String CURRENT_PRB_DL2;
    String CURRENT_PRB_DL3;
    String CURRENT_PRB_DL_SUM;
    String CURRENT_PRB_DL_SUM_NUM;
    String YESTERDATE_TIME;
    String YESTERDATE_PRB_DL;
    String YESTERDATE_PRB_DL2;
    String YESTERDATE_PRB_DL3;
    String YESTERDATE_PRB_DL_SUM;
    String YESTERDATE_PRB_DL_SUM_NUM;
    String NOW_TIME;
    String BASE_RU_ID;
    String BASE_RU_GUBUN;
    String ES_STATE;
    String ES_MODE;
    String ES_TIME;
    String ES_MIN_TIME;
    String YESTERDATE_ES_MIN_TIME;
    String ES_SWITCH;
    String DSP_ORD_SEQ;



}
