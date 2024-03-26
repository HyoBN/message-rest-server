package com.example.messagerestserver.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTBT_DATA_ALL is a Querydsl query type for TBT_DATA_ALL
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTBT_DATA_ALL extends EntityPathBase<TBT_DATA_ALL> {

    private static final long serialVersionUID = -1740781810L;

    public static final QTBT_DATA_ALL tBT_DATA_ALL = new QTBT_DATA_ALL("tBT_DATA_ALL");

    public final StringPath BASE_RU_GUBUN = createString("BASE_RU_GUBUN");

    public final StringPath BASE_RU_ID = createString("BASE_RU_ID");

    public final StringPath BOARD_NAME = createString("BOARD_NAME");

    public final StringPath CITY = createString("CITY");

    public final StringPath CURRENT_PRB_DL = createString("CURRENT_PRB_DL");

    public final StringPath CURRENT_PRB_DL2 = createString("CURRENT_PRB_DL2");

    public final StringPath CURRENT_PRB_DL3 = createString("CURRENT_PRB_DL3");

    public final StringPath CURRENT_PRB_DL_SUM = createString("CURRENT_PRB_DL_SUM");

    public final StringPath CURRENT_PRB_DL_SUM_NUM = createString("CURRENT_PRB_DL_SUM_NUM");

    public final StringPath CURRENT_TIME = createString("CURRENT_TIME");

    public final StringPath DISTRICT = createString("DISTRICT");

    public final StringPath DONG = createString("DONG");

    public final StringPath DSP_ORD_SEQ = createString("DSP_ORD_SEQ");

    public final StringPath DU_NAME = createString("DU_NAME");

    public final StringPath ELECTRIC_GUBUN_NAME = createString("ELECTRIC_GUBUN_NAME");

    public final StringPath ELECTRIC_RATE_GB_NAME = createString("ELECTRIC_RATE_GB_NAME");

    public final StringPath ES_MIN_TIME = createString("ES_MIN_TIME");

    public final StringPath ES_MODE = createString("ES_MODE");

    public final StringPath ES_STATE = createString("ES_STATE");

    public final StringPath ES_SWITCH = createString("ES_SWITCH");

    public final StringPath ES_TIME = createString("ES_TIME");

    public final StringPath F_ELECTRIC_RATE_GB_NAME = createString("F_ELECTRIC_RATE_GB_NAME");

    public final StringPath HDQT_NAME = createString("HDQT_NAME");

    public final StringPath MODEL_INPPOWER = createString("MODEL_INPPOWER");

    public final StringPath NOW_TIME = createString("NOW_TIME");

    public final StringPath RU_5G_CNT = createString("RU_5G_CNT");

    public final StringPath RU_ID = createString("RU_ID");

    public final StringPath RU_LTE_CNT = createString("RU_LTE_CNT");

    public final StringPath RU_NAME = createString("RU_NAME");

    public final StringPath SITE_ID = createString("SITE_ID");

    public final StringPath TEAM_NAME = createString("TEAM_NAME");

    public final StringPath YESTERDATE_ES_MIN_TIME = createString("YESTERDATE_ES_MIN_TIME");

    public final StringPath YESTERDATE_PRB_DL = createString("YESTERDATE_PRB_DL");

    public final StringPath YESTERDATE_PRB_DL2 = createString("YESTERDATE_PRB_DL2");

    public final StringPath YESTERDATE_PRB_DL3 = createString("YESTERDATE_PRB_DL3");

    public final StringPath YESTERDATE_PRB_DL_SUM = createString("YESTERDATE_PRB_DL_SUM");

    public final StringPath YESTERDATE_PRB_DL_SUM_NUM = createString("YESTERDATE_PRB_DL_SUM_NUM");

    public final StringPath YESTERDATE_TIME = createString("YESTERDATE_TIME");

    public QTBT_DATA_ALL(String variable) {
        super(TBT_DATA_ALL.class, forVariable(variable));
    }

    public QTBT_DATA_ALL(Path<? extends TBT_DATA_ALL> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTBT_DATA_ALL(PathMetadata metadata) {
        super(TBT_DATA_ALL.class, metadata);
    }

}

