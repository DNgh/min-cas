package com.min.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsRoleResource is a Querydsl query type for TsRoleResource
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsRoleResource extends EntityPathBase<TsRoleResource> {

    private static final long serialVersionUID = 1493440389L;

    public static final QTsRoleResource tsRoleResource = new QTsRoleResource("tsRoleResource");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Integer> jpaVersion = createNumber("jpaVersion", Integer.class);

    public final NumberPath<Long> resourceId = createNumber("resourceId", Long.class);

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QTsRoleResource(String variable) {
        super(TsRoleResource.class, forVariable(variable));
    }

    public QTsRoleResource(Path<? extends TsRoleResource> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsRoleResource(PathMetadata metadata) {
        super(TsRoleResource.class, metadata);
    }

}

