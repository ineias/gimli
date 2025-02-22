/*
 * Gimli - High-performance and multi-corpus recognition of biomedical
 * entity names
 *
 * Copyright (C) 2011 David Campos, Universidade de Aveiro, Instituto de
 * Engenharia Electrónica e Telemática de Aveiro
 *
 * Gimli is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 3.0 Unported License. To view a copy of
 * this license, visit http://creativecommons.org/licenses/by-nc-sa/3.0/.
 *
 * Gimli is a free software, you are free to copy, distribute, change and
 * transmit it. However, you may not use Gimli for commercial purposes.
 *
 * Gimli is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.
 *
 */
package pt.ua.tm.gimli.corpus;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Used to sort a set of {@link Annotation} objects.
 *
 * @author David Campos
 * (<a href="mailto:david.campos@ua.pt">david.campos@ua.pt</a>)
 * @version 1.0
 * @since 1.0
 */
public class AnnotationComparator implements
        Comparator<Annotation>, Serializable {

    /**
     * Compare two annotations, considering one bigger than the other or equal.
     * @param t 1st annotation to be compared.
     * @param t1 2nd annotation to be compared.
     * @return <code>1</code> if the 1st annotation appears latter in the
     * sentence, and <code>-1</code> if the 2nd annotation appears latter
     * in the sentence.
     */
    @Override
    public int compare(final Annotation t, final Annotation t1) {

        if (t.getStartIndex() > t1.getStartIndex()) {
            return 1;
        }
        if (t.getStartIndex() < t1.getStartIndex()) {
            return -1;
        }

        if (t.getEndIndex() > t1.getEndIndex()) {
            return 1;
        }
        if (t.getEndIndex() < t1.getEndIndex()) {
            return -1;
        }
        return 0;
    }
}
