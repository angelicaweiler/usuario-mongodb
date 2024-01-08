package com.javanauta.usuario.business;

import com.javanauta.usuario.api.converter.UsuarioConverter;
import com.javanauta.usuario.api.converter.UsuarioMapper;
import com.javanauta.usuario.api.request.UsuarioRequestDTO;
import com.javanauta.usuario.api.response.UsuarioResponseDTO;
import com.javanauta.usuario.infrastructure.entity.EnderecoEntity;
import com.javanauta.usuario.infrastructure.entity.UsuarioEntity;
import com.javanauta.usuario.infrastructure.exceptions.BusinessException;
import com.javanauta.usuario.infrastructure.repository.EnderecoRepository;
import com.javanauta.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.springframework.util.Assert.notNull;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;


    public EnderecoEntity salvaEndereco(EnderecoEntity enderecoEntity) {
        return enderecoRepository.save(enderecoEntity);
    }

    public EnderecoEntity findByUsuarioId(String usuarioId) {
        return enderecoRepository.findByUsuarioId(usuarioId);
    }

    public void deleteByUsuarioId(String usuarioId) {
        enderecoRepository.deleteByUsuarioId(usuarioId);
    }


}
