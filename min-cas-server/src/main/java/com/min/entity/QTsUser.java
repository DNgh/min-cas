package com.min.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsUser is a Querydsl query type for TsUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsUser extends EntityPathBase<TsUser> {

    private static final long serialVersionUID = -1999396436L;

    public static final QTsUser tsUser = new QTsUser("tsUser");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> jpaVersion = createNumber("jpaVersion", Integer.class);

    public final StringPath lastLoginIp = createString("lastLoginIp");

    public final DateTimePath<java.util.Date> lastLoginTime = createDateTime("lastLoginTime", java.util.Date.class);

    public final StringPath location = createString("location");

    public final NumberPath<Integer> loginCount = createNumber("loginCount", Integer.class);

    public final StringPath mobile = createString("mobile");

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    public final StringPath portrait = createString("portrait");

    public final StringPath regIp = createString("regIp");

    public final EnumPath<com.min.facility.UserState> status = createEnum("status", com.min.facility.UserState.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final StringPath username = createString("username");

    public QTsUser(String variable) {
        super(TsUser.class, forVariable(variable));
    }

    public QTsUser(Path<? extends TsUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsUser(PathMetadata metadata) {
        super(TsUser.class, metadata);
    }

}

