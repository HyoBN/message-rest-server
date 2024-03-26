package com.example.messagerestserver.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAddressDetail is a Querydsl query type for AddressDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAddressDetail extends EntityPathBase<AddressDetail> {

    private static final long serialVersionUID = 89194300L;

    public static final QAddressDetail addressDetail = new QAddressDetail("addressDetail");

    public final StringPath dong_cd = createString("dong_cd");

    public final StringPath dong_cd2 = createString("dong_cd2");

    public final StringPath dong_nm = createString("dong_nm");

    public final StringPath dong_nm2 = createString("dong_nm2");

    public final StringPath NE = createString("NE");

    public final StringPath plan = createString("plan");

    public final StringPath sido_nm = createString("sido_nm");

    public final StringPath sigungu_nm = createString("sigungu_nm");

    public final StringPath USM = createString("USM");

    public QAddressDetail(String variable) {
        super(AddressDetail.class, forVariable(variable));
    }

    public QAddressDetail(Path<? extends AddressDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddressDetail(PathMetadata metadata) {
        super(AddressDetail.class, metadata);
    }

}

