package matricula

import org.zkoss.zkgrails.*
import org.zkoss.zul.*
import org.zkoss.zk.ui.event.*
import com.institutomulticom.*;

class UploadXmlComposer extends GrailsComposer {
	Fileupload arquivoUpload

    def afterCompose = { window ->
        // initialize components here
    }
	
	def onUpload_arquivoUpload(org.zkoss.zk.ui.event.UploadEvent evento) {
		def media = evento.media
		if (media == null)
			alert("Null")
		else
			alert("Not Null")
	} 
	
	def onClick_btnProcessar() {
		
		def alunos = new XmlParser().parse("web-app/uploads/IA2011 - Matricula.xml") 
		for(int i=0;i<alunos.matricula.size();i++){
			Aluno a=new Aluno()
			a.matricula = alunos.matricula[i].Matricula.text()
			a.nome = alunos.matricula[i].Nome.text()
			a.cpf = alunos.matricula[i].CPF.text()
			a.rg = alunos.matricula[i].Rg.text()
			a.orgao = alunos.matricula[i].Orgão_Expedição.text()
			a.nascimento = new Date().parse("DD/MM/yyyy",alunos.matricula[i].Dia.text()+"/"+alunos.matricula[i].Mês.text()+"/"+alunos.matricula[i].Ano.text())
			a.sexo = alunos.matricula[i].Sexo.text()
			a.estadoCivil = alunos.matricula[i].Estado_Civil.text()
			a.cor = alunos.matricula[i].Cor.text()
			a.logradouro = alunos.matricula[i].Endereço.text()
			a.numero = alunos.matricula[i].Numero.text()
			a.bairro = alunos.matricula[i].Bairro.text()
			a.cep = alunos.matricula[i].Cep.text()
			a.cidade = alunos.matricula[i].Cidade.text()
			a.estado = alunos.matricula[i].Estado.text()
			a.telefone = alunos.matricula[i].Telefone.text()
			a.profissao = alunos.matricula[i].Profissão.text()
			a.email = alunos.matricula[i].email.text()
			a.pai = alunos.matricula[i].Pai.text()
			a.mae = alunos.matricula[i].Mãe.text()
			a.titulo = alunos.matricula[i].Titulo.text()
			a.reservista = alunos.matricula[i].Reservista.text()
			a.save()
			alert(a.nascimento)
		}
	}
}
