package kitchenpos.product.domain;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.common.base.Objects;
import org.apache.logging.log4j.util.Strings;

public final class Name {

    private final String value;

    public Name(final String value) {
        checkArgument(Strings.isNotEmpty(value), "name must be not empty. value: %s", value);

        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Name name = (Name) o;
        return Objects.equal(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
