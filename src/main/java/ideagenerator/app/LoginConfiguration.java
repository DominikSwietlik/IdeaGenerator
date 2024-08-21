/*package ideagenerator.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class LoginConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests -> authorizeRequests
                        .antMatchers("/login", "/public/**").permitAll() // Zezwala na dostęp do strony logowania i zasobów publicznych
                        .anyRequest().authenticated() // Wymaga uwierzytelnienia dla innych żądań
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/placeToVisit", true) // Strona docelowa po zalogowaniu
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout") // Strona docelowa po wylogowaniu
                        .permitAll()
                );

        return http.build();
    }
}*/
