package com.min.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsRole is a Querydsl query type for TsRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsRole extends EntityPathBase<TsRole> {

    private static final long serialVersionUID = -1999489449L;

    public static final QTsRole tsRole = new QTsRole("tsRole");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> jpaVersion = createNumber("jpaVersion", Integer.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QTsRole(String variable) {
        super(TsRole.class, forVariable(variable));
    }

    public QTsRole(Path<? extends TsRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsRole(PathMetadata metadata) {
        super(TsRole.class, metadata);
    }

}

