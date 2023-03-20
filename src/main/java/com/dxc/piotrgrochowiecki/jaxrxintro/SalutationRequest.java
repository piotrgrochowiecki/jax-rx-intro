package com.dxc.piotrgrochowiecki.jaxrxintro;

import java.io.Serializable;
import java.util.Objects;

public class SalutationRequest implements Serializable {

    private String salutation;

    @Override
    public String toString() {
        return "SalutationRequest [" +
                "salutation='" + salutation + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalutationRequest that = (SalutationRequest) o;
        return Objects.equals(salutation, that.salutation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salutation);
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
