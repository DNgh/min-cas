package com.min.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTsResource is a Querydsl query type for TsResource
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTsResource extends EntityPathBase<TsResource> {

    private static final long serialVersionUID = -917986961L;

    public static final QTsResource tsResource = new QTsResource("tsResource");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> jpaVersion = createNumber("jpaVersion", Integer.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QTsResource(String variable) {
        super(TsResource.class, forVariable(variable));
    }

    public QTsResource(Path<? extends TsResource> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTsResource(PathMetadata metadata) {
        super(TsResource.class, metadata);
    }

}

