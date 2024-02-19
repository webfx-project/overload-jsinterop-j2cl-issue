package issue;

import elemental2.dom.*;
import jsinterop.base.Js;
import org.treblereel.j2cl.processors.annotations.GWT3EntryPoint;

/**
 * @author Bruno Salmon
 */
public class Main {

    @GWT3EntryPoint
    public void entryPoint() {
        HTMLCanvasElement canvas = Js.cast(DomGlobal.document.createElement("canvas"));
        CanvasRenderingContext2D ctx = Js.cast(canvas.getContext("2d"));
        CanvasRenderingContext2DWithSetTransform ctx2 = (CanvasRenderingContext2DWithSetTransform) ctx;
        ctx2.setTransform(DOMMatrixReadOnly.fromMatrix(DOMMatrixInit.create()));
    }

}
