package io.vertx.tp.plugin.excel;

import io.modello.atom.typed.MetaAtom;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface ExTpl {
    /*
     * Excel template applying in different application
     */
    ExTpl bind(Workbook workbook);

    void applyStyle(Sheet sheet, MetaAtom metaAtom);
}
