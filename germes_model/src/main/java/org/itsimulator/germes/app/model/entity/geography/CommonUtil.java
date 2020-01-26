package org.itsimulator.germes.app.model.entity.geography;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

public class CommonUtil {
    private CommonUtil() {
    }

    public static <T> Set<T> getSafeSet(Set<T> source) {
        return Collections.unmodifiableSet(Optional.ofNullable(source).orElse(Collections.emptySet()));
    }
}
