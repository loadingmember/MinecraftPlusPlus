package com.blocks;

/**
 * Created by loadingmember on 4/18/15.
 */
public @interface BlockAnnotation {

    int blockID() default 0;

    boolean customBlock() default false;

}
