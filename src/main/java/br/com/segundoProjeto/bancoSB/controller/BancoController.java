package br.com.segundoProjeto.bancoSB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.segundoProjeto.bancoSB.dto.ContaDTO;
import br.com.segundoProjeto.bancoSB.dto.EnderecoDTO;
import br.com.segundoProjeto.bancoSB.form.AtualizacaoContaForm;
import br.com.segundoProjeto.bancoSB.form.ContaForm;
import br.com.segundoProjeto.bancoSB.model.Conta;
import br.com.segundoProjeto.bancoSB.model.Endereco;
import br.com.segundoProjeto.bancoSB.repository.ContaRepository;
import br.com.segundoProjeto.bancoSB.repository.EnderecoRepository;

@RestController
@RequestMapping("/conta")
public class BancoController {
	
	@Autowired
	private ContaRepository contaRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping
	public List<ContaDTO> listarContas() {
		//Conta conta = new Conta(306521, 100.00, 500.00, 030, 1234);
		//System.out.println("Entrou no GET  ");
		//return ContaDTO.converter(Arrays.asList(conta));
		
		List<Conta> contas = contaRepository.findAll();
		return ContaDTO.converter(contas);
		
	}
	
	@GetMapping("/enderecos")
	public List<EnderecoDTO> listarEnderecos() {
		//Endereco endereco = new Endereco("Rua Silvino", "605", "ap 402", "Centro", 89052005, "Blumenau", "Santa Catarina");
		//System.out.println("Entrou no GET Listar Endereços");
		//return EnderecoDTO.converter(Arrays.asList(endereco));
		
		List<Endereco> enderecos = enderecoRepository.findAll();
		return EnderecoDTO.converter(enderecos);
	}
	
	@GetMapping("/{numConta}")
	public Conta buscarConta(@PathVariable int numConta) {
		System.out.println("Entrou no GET Buscar Conta: " + numConta);
		return null;
	}
	
	
	@PostMapping
	public Conta salvarConta(@RequestBody ContaForm contaForm) {
		Conta conta = contaForm.converter();
		System.out.println("Entrou no POST");
		return conta;
	}
	
	@PostMapping("/depositar")
	public Conta deposito(@RequestBody ContaForm contaForm) {
		Conta conta = contaForm.converter();
		conta.depositar(70.00);
		System.out.println("Entrou no Depositar: ");
		return conta;
	}
	
	@DeleteMapping("/{numConta}")
	public Conta deletarConta(@PathVariable int numConta) {
		System.out.println("Entrou no DELETE: " + numConta);
		return null;
	}
	
	@PutMapping("/{numConta}")
	public Conta atualizarSenha(@PathVariable int numConta, @RequestBody AtualizacaoContaForm contaForm) {
		Conta contaDoBD = new Conta(501426, 550.00, 1000.00, 30, 124578);
		Conta conta = contaForm.atualizarSenha(numConta, contaDoBD);
		System.out.println("Entrou no PUT");
		return conta;
	}

}
