package com.min.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsUserRole is a Querydsl query type for TsUserRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsUserRole extends EntityPathBase<TsUserRole> {

    private static final long serialVersionUID = -843456446L;

    public static final QTsUserRole tsUserRole = new QTsUserRole("tsUserRole");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Integer> jpaVersion = createNumber("jpaVersion", Integer.class);

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QTsUserRole(String variable) {
        super(TsUserRole.class, forVariable(variable));
    }

    public QTsUserRole(Path<? extends TsUserRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsUserRole(PathMetadata metadata) {
        super(TsUserRole.class, metadata);
    }

}

