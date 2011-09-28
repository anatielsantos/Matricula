package matricula

import org.zkoss.zkgrails.*

class UploadXmlComposer extends GrailsComposer {
	Fileupload arquivoUpload

    def afterCompose = { window ->
        // initialize components here
    }
	
	def onUpload_arquivoUpload() {
		arquivoUpload.
		alert("Upload XML")
	} 
}
