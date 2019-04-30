package com.caredispenser.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caredispenser.apirest.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.caredispenser.apirest.models.Produto;
@RestController
@RequestMapping(value="/api")
@Api(value="API Rest")
@CrossOrigin(origins="*") //qualquer aplicação pode acessa-la
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produto")
	@ApiOperation(value="Retorna uma lista de produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um produto")
	public Produto listaProduto_id(@PathVariable(value="id") long id){
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produto")
	@ApiOperation(value="Salva produto")
	public Produto salvaProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value="Deleta produto")
	public void deletaProduto(@RequestBody Produto produto){
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	@ApiOperation(value="Altera produto")
	public Produto alteraProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}

}
