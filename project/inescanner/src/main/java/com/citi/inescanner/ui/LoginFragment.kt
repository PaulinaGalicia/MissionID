package com.citi.inescanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.citi.inescanner.R
import com.citi.inescanner.databinding.FragmentLoginBinding
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //boton de inicio de sesión
        binding.loginButton.setOnClickListener {
            val username = binding.usernameInput.text.toString()
            val password = binding.passwordInput.text.toString()
            viewModel.login(username, password)
        }

        viewModel.loginState.observe(viewLifecycleOwner){ isSuccess ->
            if(isSuccess){
                // credenciales correctas
                findNavController().navigate(R.id.action_loginFragment_to_scannerFragment)
            }else{
                // credenciales incorrectas
                Toast.makeText(context, "Credenciales incorrectas", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun suma(){
        val a = 1
        val b = 2
        val c = a + b
    }

    private fun resta(){
        val a = 1
        val b = 2
        val c = a - b
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun multiplicacion(){
        val a = 1
        val b = 2
        val c = a * b
    }
}