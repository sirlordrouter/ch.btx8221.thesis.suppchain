/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 *     Package Information and instantiation of TypeAdapters for LocalDate to
 *     provide String Date to Webservice callers.
 * </p>
 * Project: WebService
 * Package: entities
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 13.04.15
 */


@XmlJavaTypeAdapters(value = {
        @XmlJavaTypeAdapter(value = LocalDateAdapter.class, type = LocalDate.class),
        @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class, type = LocalDateTime.class)
})

package service;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.time.LocalDate;
import java.time.LocalDateTime;
