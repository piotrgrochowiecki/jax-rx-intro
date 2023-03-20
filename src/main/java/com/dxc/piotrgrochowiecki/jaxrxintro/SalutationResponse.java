package com.dxc.piotrgrochowiecki.jaxrxintro;

import java.io.Serializable;
import java.util.Objects;

public class SalutationResponse implements Serializable {

    private String salutationResponse;

    @Override
    public String toString() {
        return "SalutationResponse [" +
                "salutationResponse='" + salutationResponse + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalutationResponse that = (SalutationResponse) o;
        return Objects.equals(salutationResponse, that.salutationResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salutationResponse);
    }

    public String getSalutationResponse(String s) {
        return salutationResponse;
    }

    public void setSalutationResponse(String salutationResponse) {
        this.salutationResponse = salutationResponse;
    }
}
