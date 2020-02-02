package org.itsimulator.germes.app.infra.util;

import java.util.Collections;
import java.util.Set;
import java.util.Optional;
import java.util.List;

// Contains utility functions of the general purpose
public class CommonUtil {
    private CommonUtil() {
    }

    //    Returns not-null unmodifiable copy of the source set
    public static <T> Set<T> getSafeSet(Set<T> source) {
        return Collections.unmodifiableSet(Optional.ofNullable(source).orElse(Collections.emptySet()));
    }

    //    Returns not-null unmodifiable copy of the source list
    public static <T> List<T> getSafeList(List<T> source) {
        return Collections.unmodifiableList(Optional.ofNullable(source).orElse(Collections.emptyList()));
    }
}
