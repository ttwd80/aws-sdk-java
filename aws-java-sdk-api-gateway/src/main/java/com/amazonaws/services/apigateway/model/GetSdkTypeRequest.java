/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Get an <a>SdkType</a> instance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSdkTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The identifier of the queried <a>SdkType</a> instance.
     * </p>
     */
    private String id;

    /**
     * <p>
     * [Required] The identifier of the queried <a>SdkType</a> instance.
     * </p>
     * 
     * @param id
     *        [Required] The identifier of the queried <a>SdkType</a> instance.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * [Required] The identifier of the queried <a>SdkType</a> instance.
     * </p>
     * 
     * @return [Required] The identifier of the queried <a>SdkType</a> instance.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * [Required] The identifier of the queried <a>SdkType</a> instance.
     * </p>
     * 
     * @param id
     *        [Required] The identifier of the queried <a>SdkType</a> instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkTypeRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSdkTypeRequest == false)
            return false;
        GetSdkTypeRequest other = (GetSdkTypeRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetSdkTypeRequest clone() {
        return (GetSdkTypeRequest) super.clone();
    }

}
