//package com.example.messagerestserver.repository;
//
//import com.example.messagerestserver.domain.AddressDetail;
//import com.example.messagerestserver.domain.QAddressDetail;
//import com.querydsl.jpa.impl.JPAQuery;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Map;
//
//@RequiredArgsConstructor
//@Repository
//public class AddressDetailRepositoryImpl implements AddressDetailRepositoryCustom {
//    private final JPAQueryFactory queryFactory;
//
//    @Override
//    public List<AddressDetail> qGetAddressDetail(Map<String, String> params) throws NoSuchFieldException {
//        QAddressDetail addressDetail = QAddressDetail.addressDetail;
//        JPAQuery<AddressDetail> query = queryFactory.selectFrom(addressDetail);
//
//        for (Map.Entry<String, String> entry : params.entrySet()) {
//
//            switch (entry.getKey()) {
//                case "NE":
//                    query.where(addressDetail.NE.eq(entry.getValue()));
//                    break;
//                case "plan":
//                    query.where(addressDetail.plan.eq(entry.getValue()));
//                    break;
//                case "USM":
//                    query.where(addressDetail.USM.eq(entry.getValue()));
//                    break;
//                case "dong_cd":
//                    query.where(addressDetail.dong_cd.eq(entry.getValue()));
//                    break;
//                case "sido_nm":
//                    query.where(addressDetail.sido_nm.eq(entry.getValue()));
//                    break;
//                case "sigungu_nm":
//                    query.where(addressDetail.sigungu_nm.eq(entry.getValue()));
//                    break;
//                case "dong_nm":
//                    query.where(addressDetail.dong_nm.eq(entry.getValue()));
//                    break;
//                case "dong_cd2":
//                    query.where(addressDetail.dong_cd2.eq(entry.getValue()));
//                    break;
//                case "dong_nm2":
//                    query.where(addressDetail.dong_nm2.eq(entry.getValue()));
//                    break;
//            }
//        }
//        return query.fetch();
//    }
//}
//
